package factory;

import data.JobType;

public class FactoryProducer {
    public static TransferJobFactory getFactory(JobType jobType) {
        TransferJobFactory transferJob = null;

        if (jobType == JobType.IMPORT_JOB) {
            transferJob = new ImportJobFactory();
        } else if (jobType == JobType.EXPORT_JOB) {
            transferJob = new ExportJobFactory();
        }

        return transferJob;
    }
}
