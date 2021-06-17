import javax.swing.JFrame;
public aspect Notification {
	
	pointcut notificateA(): execution(* methodA*(..));
	after(): notificateA(){
		System.out.println("Se ha cambiado el fondo a color amarillo");
	}
	pointcut notificateB(): execution(* methodB*(..));
	after(): notificateB(){
		System.out.println("Se ha cambiado el fondo a color azul");
	}
	pointcut notificateC(): execution(* methodC*(..));
	after(): notificateC(){
		System.out.println("Se ha cambiado el fondo a color cian");
	}
}
