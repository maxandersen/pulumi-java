// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobQueryDestinationEncryptionConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobQueryDestinationEncryptionConfigurationArgs Empty = new JobQueryDestinationEncryptionConfigurationArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table.
     * The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    @Import(name="kmsKeyName", required=true)
    private Output<String> kmsKeyName;

    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * - 
     * Describes the Cloud KMS encryption key version used to protect destination BigQuery table.
     * 
     */
    @Import(name="kmsKeyVersion")
    private @Nullable Output<String> kmsKeyVersion;

    public Optional<Output<String>> kmsKeyVersion() {
        return Optional.ofNullable(this.kmsKeyVersion);
    }

    private JobQueryDestinationEncryptionConfigurationArgs() {}

    private JobQueryDestinationEncryptionConfigurationArgs(JobQueryDestinationEncryptionConfigurationArgs $) {
        this.kmsKeyName = $.kmsKeyName;
        this.kmsKeyVersion = $.kmsKeyVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobQueryDestinationEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobQueryDestinationEncryptionConfigurationArgs $;

        public Builder() {
            $ = new JobQueryDestinationEncryptionConfigurationArgs();
        }

        public Builder(JobQueryDestinationEncryptionConfigurationArgs defaults) {
            $ = new JobQueryDestinationEncryptionConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public Builder kmsKeyVersion(@Nullable Output<String> kmsKeyVersion) {
            $.kmsKeyVersion = kmsKeyVersion;
            return this;
        }

        public Builder kmsKeyVersion(String kmsKeyVersion) {
            return kmsKeyVersion(Output.of(kmsKeyVersion));
        }

        public JobQueryDestinationEncryptionConfigurationArgs build() {
            $.kmsKeyName = Objects.requireNonNull($.kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
            return $;
        }
    }

}
