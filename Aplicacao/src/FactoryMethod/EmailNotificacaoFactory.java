package FactoryMethod;

public class EmailNotificacaoFactory extends NotificacaoFactory{
    @override
    public Notificacao criarNotificacao(){
        return new Notificacao();
    }
}