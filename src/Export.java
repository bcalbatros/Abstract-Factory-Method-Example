import data.JobType;
import data.TransferTypeEnum;
import factory.ExportJobFactory;
import factory.FactoryProducer;
import factory.ImportJobFactory;
import service.*;

public class Export {

    static void main(String args[]) {

        // Factories
        ImportJobFactory importFactory = (ImportJobFactory) FactoryProducer.getFactory(JobType.IMPORT_JOB);
        ExportJobFactory exportFactory = (ExportJobFactory) FactoryProducer.getFactory(JobType.EXPORT_JOB);

        // Import Jobs
        PictureImportJob pictureImportJob = (PictureImportJob) importFactory.createImportJob(TransferTypeEnum.PICTURE_EXPORT);
        VideoImportJob videoımportJob = (VideoImportJob) importFactory.createImportJob(TransferTypeEnum.VIDEO_EXPORT);

        // Export Jobs
        PictureExportJob pictureExportJob = (PictureExportJob) exportFactory.createExportJob(TransferTypeEnum.PICTURE_EXPORT);
        VideoExportJob videoExportJob = (VideoExportJob) exportFactory.createExportJob(TransferTypeEnum.VIDEO_EXPORT);
    }

}
