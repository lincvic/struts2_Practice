package service;


import dao.ClientDao;
import entity.Client;

import java.util.List;

/**
 * @Author Nuc YongGuang Ji.
 * @Date 15:07 2017/6/22.
 * @Descrip
 */
public class ClientService {

    public Client LoginClient(int id, String password) {
        if (password != null && !"".equals(password.trim())) {
            ClientDao clientDao = new ClientDao();
            Client client = new Client();
            client.setClientId(id);
            client.setPassword(password);
            return clientDao.LoginClient(client);
        } else throw new RuntimeException("ClientService 的 LoginClient方法 参数输入不合法！");
    }

    public void insertClient(String name, String password, String phonenumbe, String address) {
        if ((name != null && !"".equals(name.trim())) &&
                (password != null && !"".equals(password.trim())) &&
                (phonenumbe != null && !"".equals(phonenumbe.trim())) &&
                (address != null && !"".equals(address.trim()))) {
            Client client = new Client();
            client.setName(name);
            client.setPassword(password);
            client.setPhoneNumber(phonenumbe);
            client.setAddress(address);

            ClientDao clientDao = new ClientDao();
            clientDao.insertClient(client);
        } else throw new RuntimeException("ClientService 的 insertClient 方法 参数输入不合法！");
    }

    public List<Client> selectClientList() {
        ClientDao clientDao = new ClientDao();
        return clientDao.selectClientList();
    }

    public Client selectClient(String id) {
        if (!"".equals(id) && id != null) {
            ClientDao clientDao = new ClientDao();
            return clientDao.selectClient(Integer.parseInt(id));
        } else throw new RuntimeException("ClientService 的 selectClient 方法 参数输入不合法！");
    }

    public void deleteClient(int clientid) {
        if (clientid > 0) {
            ClientDao clientDao = new ClientDao();
            clientDao.deleteClient(clientid);
        } else throw new RuntimeException("ClientService 的 deleteClient 参数输入不合法！");
    }

    public void UpdateClient(int clientid, String name, String password, String phonenumbe, String address) {
        if (clientid > 0 &&
                (name != null && !"".equals(name.trim())) &&
                (password != null && !"".equals(password.trim())) &&
                (phonenumbe != null && !"".equals(phonenumbe.trim())) &&
                (address != null && !"".equals(address.trim()))) {
            Client client = new Client();
            client.setClientId(clientid);
            client.setName(name);
            client.setPassword(password);
            client.setPhoneNumber(phonenumbe);
            client.setAddress(address);

            ClientDao clientDao = new ClientDao();
            clientDao.UpdateClient(client);
        } else throw new RuntimeException("ClientService 的 UpdateClient 参数输入不合法！");
    }

}
