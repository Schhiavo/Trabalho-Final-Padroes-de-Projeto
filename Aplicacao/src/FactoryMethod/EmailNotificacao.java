package FactoryMethod;

public class EmailNotificacao implements Notificacao{
    @override
    public void enviarMensagem(String mensagem){
        return "Enviando email: " + mensagem;
    }
}