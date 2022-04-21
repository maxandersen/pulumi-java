// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.inputs;

import com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs;
import com.pulumi.aws.fsx.inputs.OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OpenZfsFileSystemRootVolumeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final OpenZfsFileSystemRootVolumeConfigurationArgs Empty = new OpenZfsFileSystemRootVolumeConfigurationArgs();

    /**
     * - A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
     * 
     */
    @Import(name="copyTagsToSnapshots")
    private @Nullable Output<Boolean> copyTagsToSnapshots;

    public Optional<Output<Boolean>> copyTagsToSnapshots() {
        return Optional.ofNullable(this.copyTagsToSnapshots);
    }

    /**
     * - Method used to compress the data on the volume. Valid values are `NONE` or `ZSTD`. Child volumes that don&#39;t specify compression option will inherit from parent volume. This option on file system applies to the root volume.
     * 
     */
    @Import(name="dataCompressionType")
    private @Nullable Output<String> dataCompressionType;

    public Optional<Output<String>> dataCompressionType() {
        return Optional.ofNullable(this.dataCompressionType);
    }

    /**
     * - NFS export configuration for the root volume. Exactly 1 item. See NFS Exports Below.
     * 
     */
    @Import(name="nfsExports")
    private @Nullable Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs> nfsExports;

    public Optional<Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs>> nfsExports() {
        return Optional.ofNullable(this.nfsExports);
    }

    /**
     * - specifies whether the volume is read-only. Default is false.
     * 
     */
    @Import(name="readOnly")
    private @Nullable Output<Boolean> readOnly;

    public Optional<Output<Boolean>> readOnly() {
        return Optional.ofNullable(this.readOnly);
    }

    /**
     * - Specify how much storage users or groups can use on the volume. Maximum of 100 items. See User and Group Quotas Below.
     * 
     */
    @Import(name="userAndGroupQuotas")
    private @Nullable Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs>> userAndGroupQuotas;

    public Optional<Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs>>> userAndGroupQuotas() {
        return Optional.ofNullable(this.userAndGroupQuotas);
    }

    private OpenZfsFileSystemRootVolumeConfigurationArgs() {}

    private OpenZfsFileSystemRootVolumeConfigurationArgs(OpenZfsFileSystemRootVolumeConfigurationArgs $) {
        this.copyTagsToSnapshots = $.copyTagsToSnapshots;
        this.dataCompressionType = $.dataCompressionType;
        this.nfsExports = $.nfsExports;
        this.readOnly = $.readOnly;
        this.userAndGroupQuotas = $.userAndGroupQuotas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OpenZfsFileSystemRootVolumeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OpenZfsFileSystemRootVolumeConfigurationArgs $;

        public Builder() {
            $ = new OpenZfsFileSystemRootVolumeConfigurationArgs();
        }

        public Builder(OpenZfsFileSystemRootVolumeConfigurationArgs defaults) {
            $ = new OpenZfsFileSystemRootVolumeConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder copyTagsToSnapshots(@Nullable Output<Boolean> copyTagsToSnapshots) {
            $.copyTagsToSnapshots = copyTagsToSnapshots;
            return this;
        }

        public Builder copyTagsToSnapshots(Boolean copyTagsToSnapshots) {
            return copyTagsToSnapshots(Output.of(copyTagsToSnapshots));
        }

        public Builder dataCompressionType(@Nullable Output<String> dataCompressionType) {
            $.dataCompressionType = dataCompressionType;
            return this;
        }

        public Builder dataCompressionType(String dataCompressionType) {
            return dataCompressionType(Output.of(dataCompressionType));
        }

        public Builder nfsExports(@Nullable Output<OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs> nfsExports) {
            $.nfsExports = nfsExports;
            return this;
        }

        public Builder nfsExports(OpenZfsFileSystemRootVolumeConfigurationNfsExportsArgs nfsExports) {
            return nfsExports(Output.of(nfsExports));
        }

        public Builder readOnly(@Nullable Output<Boolean> readOnly) {
            $.readOnly = readOnly;
            return this;
        }

        public Builder readOnly(Boolean readOnly) {
            return readOnly(Output.of(readOnly));
        }

        public Builder userAndGroupQuotas(@Nullable Output<List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs>> userAndGroupQuotas) {
            $.userAndGroupQuotas = userAndGroupQuotas;
            return this;
        }

        public Builder userAndGroupQuotas(List<OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs> userAndGroupQuotas) {
            return userAndGroupQuotas(Output.of(userAndGroupQuotas));
        }

        public Builder userAndGroupQuotas(OpenZfsFileSystemRootVolumeConfigurationUserAndGroupQuotaArgs... userAndGroupQuotas) {
            return userAndGroupQuotas(List.of(userAndGroupQuotas));
        }

        public OpenZfsFileSystemRootVolumeConfigurationArgs build() {
            return $;
        }
    }

}
