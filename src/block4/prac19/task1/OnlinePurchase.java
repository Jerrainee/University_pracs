package block4.prac19.task1;

import java.util.HashMap;
import java.util.Map;

public class OnlinePurchase {

    private final Map<String, Client> clientDatabase = new HashMap<>();

    public OnlinePurchase() {
        registerClient(new Client("иванов иван иванович", "770123456789"));
        registerClient(new Client("петров петр петрович", "500112233445"));
        registerClient(new Client("ооо вектор", "7705123456"));
    }

    public void registerClient(Client client) {
        clientDatabase.put(client.getFullName().trim().toLowerCase(), client);
    }

    public void processOrder(String fullName, String inn, String item, double price) throws InvalidInnException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new InvalidInnException("пустое фио", inn);
        }

        if (inn == null || inn.trim().isEmpty()) {
            throw new InvalidInnException("пустой инн", inn);
        }

        String cleanInn = inn.trim();

        if (!cleanInn.matches("\\d+")) {
            throw new InvalidInnException("неверные символы", cleanInn);
        }

        if (cleanInn.length() != 10 && cleanInn.length() != 12) {
            throw new InvalidInnException("неверная длина", cleanInn);
        }

        String key = fullName.trim().toLowerCase();
        Client registered = clientDatabase.get(key);

        if (registered == null) {
            throw new InvalidInnException("клиент не найден", cleanInn);
        }

        if (!registered.getInn().equals(cleanInn)) {
            throw new InvalidInnException("неверный инн", cleanInn);
        }

        System.out.println("заказ оформлен");
    }
}
