// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureBackupParamsResponse {
    /**
     * BackupType ; Full/Incremental etc
     * 
     */
    private final String backupType;
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AzureBackupParams'.
     * 
     */
    private final String objectType;

    @CustomType.Constructor
    private AzureBackupParamsResponse(
        @CustomType.Parameter("backupType") String backupType,
        @CustomType.Parameter("objectType") String objectType) {
        this.backupType = backupType;
        this.objectType = objectType;
    }

    /**
     * BackupType ; Full/Incremental etc
     * 
    */
    public String backupType() {
        return this.backupType;
    }
    /**
     * Type of the specific object - used for deserializing
     * Expected value is 'AzureBackupParams'.
     * 
    */
    public String objectType() {
        return this.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureBackupParamsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupType;
        private String objectType;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureBackupParamsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupType = defaults.backupType;
    	      this.objectType = defaults.objectType;
        }

        public Builder backupType(String backupType) {
            this.backupType = Objects.requireNonNull(backupType);
            return this;
        }
        public Builder objectType(String objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }        public AzureBackupParamsResponse build() {
            return new AzureBackupParamsResponse(backupType, objectType);
        }
    }
}
