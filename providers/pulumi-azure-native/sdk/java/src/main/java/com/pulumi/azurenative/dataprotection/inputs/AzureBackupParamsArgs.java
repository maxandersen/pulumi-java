// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Azure backup parameters
 * 
 */
public final class AzureBackupParamsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureBackupParamsArgs Empty = new AzureBackupParamsArgs();

    /**
     * BackupType ; Full/Incremental etc
     * 
     */
    @Import(name="backupType", required=true)
    private Output<String> backupType;

    public Output<String> backupType() {
        return this.backupType;
    }

    /**
     * Type of the specific object - used for deserializing
     * Expected value is &#39;AzureBackupParams&#39;.
     * 
     */
    @Import(name="objectType", required=true)
    private Output<String> objectType;

    public Output<String> objectType() {
        return this.objectType;
    }

    private AzureBackupParamsArgs() {}

    private AzureBackupParamsArgs(AzureBackupParamsArgs $) {
        this.backupType = $.backupType;
        this.objectType = $.objectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureBackupParamsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureBackupParamsArgs $;

        public Builder() {
            $ = new AzureBackupParamsArgs();
        }

        public Builder(AzureBackupParamsArgs defaults) {
            $ = new AzureBackupParamsArgs(Objects.requireNonNull(defaults));
        }

        public Builder backupType(Output<String> backupType) {
            $.backupType = backupType;
            return this;
        }

        public Builder backupType(String backupType) {
            return backupType(Output.of(backupType));
        }

        public Builder objectType(Output<String> objectType) {
            $.objectType = objectType;
            return this;
        }

        public Builder objectType(String objectType) {
            return objectType(Output.of(objectType));
        }

        public AzureBackupParamsArgs build() {
            $.backupType = Objects.requireNonNull($.backupType, "expected parameter 'backupType' to be non-null");
            $.objectType = Codegen.stringProp("objectType").output().arg($.objectType).require();
            return $;
        }
    }

}
