package model;

public class Solicitudes {
    private Solicitud[] solicitudes = new Solicitud[50];
    int totalSolicitudes = 0;

    public boolean registro(Solicitud soli) {
        if (totalSolicitudes == solicitudes.length) {
            return false;
        }
        for (int i = 0; i < totalSolicitudes; i++) {
            if (solicitudes[i].getId().equals(soli.getId())) {
                return false;
            }
        }
        solicitudes[totalSolicitudes] = soli;
        totalSolicitudes++;
        return true;
    }

    public boolean estadoSolicitud(String id, String estado) {
        for (int i = 0; i < totalSolicitudes; i++) {
            if (solicitudes[i].getId().equals(id)) {
                solicitudes[i].setEstadoSolicitud(estado);
                return true;
            }
        }
        return false;
    }
    //se valida si el getter de estado solicitud está pendiente
    public Solicitud[] solicitudesPendientes() {
        int recolectado = 0;
        Solicitud[] pendiente = new Solicitud[totalSolicitudes];
        for (int i = 0; i < totalSolicitudes; i++) {
            if(solicitudes[i].getEstadoSolicitud().equals("Pendiente")){
                pendiente[recolectado] = solicitudes[i];
                recolectado++;
            }
        }
        return pendiente;
    }
//historial de solicitudes (tipo listado)
    public Solicitud[] consultaHistorial(){
        Solicitud[] personas = new Solicitud[totalSolicitudes];
        for (int i = 0; i < totalSolicitudes; i++) {
            personas[i]=solicitudes[i];
        }
        return personas;
    }
}
