// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.storagetransfer_v1.outputs.AwsS3DataResponse;
import com.pulumi.googlenative.storagetransfer_v1.outputs.AzureBlobStorageDataResponse;
import com.pulumi.googlenative.storagetransfer_v1.outputs.GcsDataResponse;
import com.pulumi.googlenative.storagetransfer_v1.outputs.HttpDataResponse;
import com.pulumi.googlenative.storagetransfer_v1.outputs.ObjectConditionsResponse;
import com.pulumi.googlenative.storagetransfer_v1.outputs.PosixFilesystemResponse;
import com.pulumi.googlenative.storagetransfer_v1.outputs.TransferManifestResponse;
import com.pulumi.googlenative.storagetransfer_v1.outputs.TransferOptionsResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TransferSpecResponse {
    /**
     * An AWS S3 data source.
     * 
     */
    private final AwsS3DataResponse awsS3DataSource;
    /**
     * An Azure Blob Storage data source.
     * 
     */
    private final AzureBlobStorageDataResponse azureBlobStorageDataSource;
    /**
     * A Cloud Storage data sink.
     * 
     */
    private final GcsDataResponse gcsDataSink;
    /**
     * A Cloud Storage data source.
     * 
     */
    private final GcsDataResponse gcsDataSource;
    /**
     * Cloud Storage intermediate data location.
     * 
     */
    private final GcsDataResponse gcsIntermediateDataLocation;
    /**
     * An HTTP URL data source.
     * 
     */
    private final HttpDataResponse httpDataSource;
    /**
     * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' "last modification time" do not exclude objects in a data sink.
     * 
     */
    private final ObjectConditionsResponse objectConditions;
    /**
     * A POSIX Filesystem data sink.
     * 
     */
    private final PosixFilesystemResponse posixDataSink;
    /**
     * A POSIX Filesystem data source.
     * 
     */
    private final PosixFilesystemResponse posixDataSource;
    /**
     * Specifies the agent pool name associated with the posix data sink. When unspecified, the default name is used.
     * 
     */
    private final String sinkAgentPoolName;
    /**
     * Specifies the agent pool name associated with the posix data source. When unspecified, the default name is used.
     * 
     */
    private final String sourceAgentPoolName;
    /**
     * A manifest file provides a list of objects to be transferred from the data source. This field points to the location of the manifest file. Otherwise, the entire source bucket is used. ObjectConditions still apply.
     * 
     */
    private final TransferManifestResponse transferManifest;
    /**
     * If the option delete_objects_unique_in_sink is `true` and time-based object conditions such as 'last modification time' are specified, the request fails with an INVALID_ARGUMENT error.
     * 
     */
    private final TransferOptionsResponse transferOptions;

    @CustomType.Constructor
    private TransferSpecResponse(
        @CustomType.Parameter("awsS3DataSource") AwsS3DataResponse awsS3DataSource,
        @CustomType.Parameter("azureBlobStorageDataSource") AzureBlobStorageDataResponse azureBlobStorageDataSource,
        @CustomType.Parameter("gcsDataSink") GcsDataResponse gcsDataSink,
        @CustomType.Parameter("gcsDataSource") GcsDataResponse gcsDataSource,
        @CustomType.Parameter("gcsIntermediateDataLocation") GcsDataResponse gcsIntermediateDataLocation,
        @CustomType.Parameter("httpDataSource") HttpDataResponse httpDataSource,
        @CustomType.Parameter("objectConditions") ObjectConditionsResponse objectConditions,
        @CustomType.Parameter("posixDataSink") PosixFilesystemResponse posixDataSink,
        @CustomType.Parameter("posixDataSource") PosixFilesystemResponse posixDataSource,
        @CustomType.Parameter("sinkAgentPoolName") String sinkAgentPoolName,
        @CustomType.Parameter("sourceAgentPoolName") String sourceAgentPoolName,
        @CustomType.Parameter("transferManifest") TransferManifestResponse transferManifest,
        @CustomType.Parameter("transferOptions") TransferOptionsResponse transferOptions) {
        this.awsS3DataSource = awsS3DataSource;
        this.azureBlobStorageDataSource = azureBlobStorageDataSource;
        this.gcsDataSink = gcsDataSink;
        this.gcsDataSource = gcsDataSource;
        this.gcsIntermediateDataLocation = gcsIntermediateDataLocation;
        this.httpDataSource = httpDataSource;
        this.objectConditions = objectConditions;
        this.posixDataSink = posixDataSink;
        this.posixDataSource = posixDataSource;
        this.sinkAgentPoolName = sinkAgentPoolName;
        this.sourceAgentPoolName = sourceAgentPoolName;
        this.transferManifest = transferManifest;
        this.transferOptions = transferOptions;
    }

    /**
     * An AWS S3 data source.
     * 
    */
    public AwsS3DataResponse awsS3DataSource() {
        return this.awsS3DataSource;
    }
    /**
     * An Azure Blob Storage data source.
     * 
    */
    public AzureBlobStorageDataResponse azureBlobStorageDataSource() {
        return this.azureBlobStorageDataSource;
    }
    /**
     * A Cloud Storage data sink.
     * 
    */
    public GcsDataResponse gcsDataSink() {
        return this.gcsDataSink;
    }
    /**
     * A Cloud Storage data source.
     * 
    */
    public GcsDataResponse gcsDataSource() {
        return this.gcsDataSource;
    }
    /**
     * Cloud Storage intermediate data location.
     * 
    */
    public GcsDataResponse gcsIntermediateDataLocation() {
        return this.gcsIntermediateDataLocation;
    }
    /**
     * An HTTP URL data source.
     * 
    */
    public HttpDataResponse httpDataSource() {
        return this.httpDataSource;
    }
    /**
     * Only objects that satisfy these object conditions are included in the set of data source and data sink objects. Object conditions based on objects' "last modification time" do not exclude objects in a data sink.
     * 
    */
    public ObjectConditionsResponse objectConditions() {
        return this.objectConditions;
    }
    /**
     * A POSIX Filesystem data sink.
     * 
    */
    public PosixFilesystemResponse posixDataSink() {
        return this.posixDataSink;
    }
    /**
     * A POSIX Filesystem data source.
     * 
    */
    public PosixFilesystemResponse posixDataSource() {
        return this.posixDataSource;
    }
    /**
     * Specifies the agent pool name associated with the posix data sink. When unspecified, the default name is used.
     * 
    */
    public String sinkAgentPoolName() {
        return this.sinkAgentPoolName;
    }
    /**
     * Specifies the agent pool name associated with the posix data source. When unspecified, the default name is used.
     * 
    */
    public String sourceAgentPoolName() {
        return this.sourceAgentPoolName;
    }
    /**
     * A manifest file provides a list of objects to be transferred from the data source. This field points to the location of the manifest file. Otherwise, the entire source bucket is used. ObjectConditions still apply.
     * 
    */
    public TransferManifestResponse transferManifest() {
        return this.transferManifest;
    }
    /**
     * If the option delete_objects_unique_in_sink is `true` and time-based object conditions such as 'last modification time' are specified, the request fails with an INVALID_ARGUMENT error.
     * 
    */
    public TransferOptionsResponse transferOptions() {
        return this.transferOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsS3DataResponse awsS3DataSource;
        private AzureBlobStorageDataResponse azureBlobStorageDataSource;
        private GcsDataResponse gcsDataSink;
        private GcsDataResponse gcsDataSource;
        private GcsDataResponse gcsIntermediateDataLocation;
        private HttpDataResponse httpDataSource;
        private ObjectConditionsResponse objectConditions;
        private PosixFilesystemResponse posixDataSink;
        private PosixFilesystemResponse posixDataSource;
        private String sinkAgentPoolName;
        private String sourceAgentPoolName;
        private TransferManifestResponse transferManifest;
        private TransferOptionsResponse transferOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsS3DataSource = defaults.awsS3DataSource;
    	      this.azureBlobStorageDataSource = defaults.azureBlobStorageDataSource;
    	      this.gcsDataSink = defaults.gcsDataSink;
    	      this.gcsDataSource = defaults.gcsDataSource;
    	      this.gcsIntermediateDataLocation = defaults.gcsIntermediateDataLocation;
    	      this.httpDataSource = defaults.httpDataSource;
    	      this.objectConditions = defaults.objectConditions;
    	      this.posixDataSink = defaults.posixDataSink;
    	      this.posixDataSource = defaults.posixDataSource;
    	      this.sinkAgentPoolName = defaults.sinkAgentPoolName;
    	      this.sourceAgentPoolName = defaults.sourceAgentPoolName;
    	      this.transferManifest = defaults.transferManifest;
    	      this.transferOptions = defaults.transferOptions;
        }

        public Builder awsS3DataSource(AwsS3DataResponse awsS3DataSource) {
            this.awsS3DataSource = Objects.requireNonNull(awsS3DataSource);
            return this;
        }
        public Builder azureBlobStorageDataSource(AzureBlobStorageDataResponse azureBlobStorageDataSource) {
            this.azureBlobStorageDataSource = Objects.requireNonNull(azureBlobStorageDataSource);
            return this;
        }
        public Builder gcsDataSink(GcsDataResponse gcsDataSink) {
            this.gcsDataSink = Objects.requireNonNull(gcsDataSink);
            return this;
        }
        public Builder gcsDataSource(GcsDataResponse gcsDataSource) {
            this.gcsDataSource = Objects.requireNonNull(gcsDataSource);
            return this;
        }
        public Builder gcsIntermediateDataLocation(GcsDataResponse gcsIntermediateDataLocation) {
            this.gcsIntermediateDataLocation = Objects.requireNonNull(gcsIntermediateDataLocation);
            return this;
        }
        public Builder httpDataSource(HttpDataResponse httpDataSource) {
            this.httpDataSource = Objects.requireNonNull(httpDataSource);
            return this;
        }
        public Builder objectConditions(ObjectConditionsResponse objectConditions) {
            this.objectConditions = Objects.requireNonNull(objectConditions);
            return this;
        }
        public Builder posixDataSink(PosixFilesystemResponse posixDataSink) {
            this.posixDataSink = Objects.requireNonNull(posixDataSink);
            return this;
        }
        public Builder posixDataSource(PosixFilesystemResponse posixDataSource) {
            this.posixDataSource = Objects.requireNonNull(posixDataSource);
            return this;
        }
        public Builder sinkAgentPoolName(String sinkAgentPoolName) {
            this.sinkAgentPoolName = Objects.requireNonNull(sinkAgentPoolName);
            return this;
        }
        public Builder sourceAgentPoolName(String sourceAgentPoolName) {
            this.sourceAgentPoolName = Objects.requireNonNull(sourceAgentPoolName);
            return this;
        }
        public Builder transferManifest(TransferManifestResponse transferManifest) {
            this.transferManifest = Objects.requireNonNull(transferManifest);
            return this;
        }
        public Builder transferOptions(TransferOptionsResponse transferOptions) {
            this.transferOptions = Objects.requireNonNull(transferOptions);
            return this;
        }        public TransferSpecResponse build() {
            return new TransferSpecResponse(awsS3DataSource, azureBlobStorageDataSource, gcsDataSink, gcsDataSource, gcsIntermediateDataLocation, httpDataSource, objectConditions, posixDataSink, posixDataSource, sinkAgentPoolName, sourceAgentPoolName, transferManifest, transferOptions);
        }
    }
}
