// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs.inputs;

import com.pulumi.aws.efs.inputs.FileSystemLifecyclePolicyGetArgs;
import com.pulumi.aws.efs.inputs.FileSystemSizeInByteGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemState extends com.pulumi.resources.ResourceArgs {

    public static final FileSystemState Empty = new FileSystemState();

    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The identifier of the Availability Zone in which the file system&#39;s One Zone storage classes exist.
     * 
     */
    @Import(name="availabilityZoneId")
    private @Nullable Output<String> availabilityZoneId;

    public Optional<Output<String>> availabilityZoneId() {
        return Optional.ofNullable(this.availabilityZoneId);
    }

    /**
     * the AWS Availability Zone in which to create the file system. Used to create a file system that uses One Zone storage classes. See [user guide](https://docs.aws.amazon.com/efs/latest/ug/storage-classes.html) for more information.
     * 
     */
    @Import(name="availabilityZoneName")
    private @Nullable Output<String> availabilityZoneName;

    public Optional<Output<String>> availabilityZoneName() {
        return Optional.ofNullable(this.availabilityZoneName);
    }

    /**
     * A unique name (a maximum of 64 characters are allowed)
     * used as reference when creating the Elastic File System to ensure idempotent file
     * system creation. By default generated by this provider. See [Elastic File System]
     * (http://docs.aws.amazon.com/efs/latest/ug/) user guide for more information.
     * 
     */
    @Import(name="creationToken")
    private @Nullable Output<String> creationToken;

    public Optional<Output<String>> creationToken() {
        return Optional.ofNullable(this.creationToken);
    }

    /**
     * The DNS name for the filesystem per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
     * 
     */
    @Import(name="dnsName")
    private @Nullable Output<String> dnsName;

    public Optional<Output<String>> dnsName() {
        return Optional.ofNullable(this.dnsName);
    }

    /**
     * If true, the disk will be encrypted.
     * 
     */
    @Import(name="encrypted")
    private @Nullable Output<Boolean> encrypted;

    public Optional<Output<Boolean>> encrypted() {
        return Optional.ofNullable(this.encrypted);
    }

    /**
     * The ARN for the KMS encryption key. When specifying kms_key_id, encrypted needs to be set to true.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * A file system [lifecycle policy](https://docs.aws.amazon.com/efs/latest/ug/API_LifecyclePolicy.html) object (documented below).
     * 
     */
    @Import(name="lifecyclePolicy")
    private @Nullable Output<FileSystemLifecyclePolicyGetArgs> lifecyclePolicy;

    public Optional<Output<FileSystemLifecyclePolicyGetArgs>> lifecyclePolicy() {
        return Optional.ofNullable(this.lifecyclePolicy);
    }

    /**
     * The current number of mount targets that the file system has.
     * 
     */
    @Import(name="numberOfMountTargets")
    private @Nullable Output<Integer> numberOfMountTargets;

    public Optional<Output<Integer>> numberOfMountTargets() {
        return Optional.ofNullable(this.numberOfMountTargets);
    }

    /**
     * The AWS account that created the file system. If the file system was createdby an IAM user, the parent account to which the user belongs is the owner.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * The file system performance mode. Can be either `&#34;generalPurpose&#34;` or `&#34;maxIO&#34;` (Default: `&#34;generalPurpose&#34;`).
     * 
     */
    @Import(name="performanceMode")
    private @Nullable Output<String> performanceMode;

    public Optional<Output<String>> performanceMode() {
        return Optional.ofNullable(this.performanceMode);
    }

    /**
     * The throughput, measured in MiB/s, that you want to provision for the file system. Only applicable with `throughput_mode` set to `provisioned`.
     * 
     */
    @Import(name="provisionedThroughputInMibps")
    private @Nullable Output<Double> provisionedThroughputInMibps;

    public Optional<Output<Double>> provisionedThroughputInMibps() {
        return Optional.ofNullable(this.provisionedThroughputInMibps);
    }

    /**
     * The latest known metered size (in bytes) of data stored in the file system, the value is not the exact size that the file system was at any point in time. See Size In Bytes.
     * 
     */
    @Import(name="sizeInBytes")
    private @Nullable Output<List<FileSystemSizeInByteGetArgs>> sizeInBytes;

    public Optional<Output<List<FileSystemSizeInByteGetArgs>>> sizeInBytes() {
        return Optional.ofNullable(this.sizeInBytes);
    }

    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Throughput mode for the file system. Defaults to `bursting`. Valid values: `bursting`, `provisioned`. When using `provisioned`, also set `provisioned_throughput_in_mibps`.
     * 
     */
    @Import(name="throughputMode")
    private @Nullable Output<String> throughputMode;

    public Optional<Output<String>> throughputMode() {
        return Optional.ofNullable(this.throughputMode);
    }

    private FileSystemState() {}

    private FileSystemState(FileSystemState $) {
        this.arn = $.arn;
        this.availabilityZoneId = $.availabilityZoneId;
        this.availabilityZoneName = $.availabilityZoneName;
        this.creationToken = $.creationToken;
        this.dnsName = $.dnsName;
        this.encrypted = $.encrypted;
        this.kmsKeyId = $.kmsKeyId;
        this.lifecyclePolicy = $.lifecyclePolicy;
        this.numberOfMountTargets = $.numberOfMountTargets;
        this.ownerId = $.ownerId;
        this.performanceMode = $.performanceMode;
        this.provisionedThroughputInMibps = $.provisionedThroughputInMibps;
        this.sizeInBytes = $.sizeInBytes;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.throughputMode = $.throughputMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FileSystemState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileSystemState $;

        public Builder() {
            $ = new FileSystemState();
        }

        public Builder(FileSystemState defaults) {
            $ = new FileSystemState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder availabilityZoneId(@Nullable Output<String> availabilityZoneId) {
            $.availabilityZoneId = availabilityZoneId;
            return this;
        }

        public Builder availabilityZoneId(String availabilityZoneId) {
            return availabilityZoneId(Output.of(availabilityZoneId));
        }

        public Builder availabilityZoneName(@Nullable Output<String> availabilityZoneName) {
            $.availabilityZoneName = availabilityZoneName;
            return this;
        }

        public Builder availabilityZoneName(String availabilityZoneName) {
            return availabilityZoneName(Output.of(availabilityZoneName));
        }

        public Builder creationToken(@Nullable Output<String> creationToken) {
            $.creationToken = creationToken;
            return this;
        }

        public Builder creationToken(String creationToken) {
            return creationToken(Output.of(creationToken));
        }

        public Builder dnsName(@Nullable Output<String> dnsName) {
            $.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(String dnsName) {
            return dnsName(Output.of(dnsName));
        }

        public Builder encrypted(@Nullable Output<Boolean> encrypted) {
            $.encrypted = encrypted;
            return this;
        }

        public Builder encrypted(Boolean encrypted) {
            return encrypted(Output.of(encrypted));
        }

        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        public Builder lifecyclePolicy(@Nullable Output<FileSystemLifecyclePolicyGetArgs> lifecyclePolicy) {
            $.lifecyclePolicy = lifecyclePolicy;
            return this;
        }

        public Builder lifecyclePolicy(FileSystemLifecyclePolicyGetArgs lifecyclePolicy) {
            return lifecyclePolicy(Output.of(lifecyclePolicy));
        }

        public Builder numberOfMountTargets(@Nullable Output<Integer> numberOfMountTargets) {
            $.numberOfMountTargets = numberOfMountTargets;
            return this;
        }

        public Builder numberOfMountTargets(Integer numberOfMountTargets) {
            return numberOfMountTargets(Output.of(numberOfMountTargets));
        }

        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder performanceMode(@Nullable Output<String> performanceMode) {
            $.performanceMode = performanceMode;
            return this;
        }

        public Builder performanceMode(String performanceMode) {
            return performanceMode(Output.of(performanceMode));
        }

        public Builder provisionedThroughputInMibps(@Nullable Output<Double> provisionedThroughputInMibps) {
            $.provisionedThroughputInMibps = provisionedThroughputInMibps;
            return this;
        }

        public Builder provisionedThroughputInMibps(Double provisionedThroughputInMibps) {
            return provisionedThroughputInMibps(Output.of(provisionedThroughputInMibps));
        }

        public Builder sizeInBytes(@Nullable Output<List<FileSystemSizeInByteGetArgs>> sizeInBytes) {
            $.sizeInBytes = sizeInBytes;
            return this;
        }

        public Builder sizeInBytes(List<FileSystemSizeInByteGetArgs> sizeInBytes) {
            return sizeInBytes(Output.of(sizeInBytes));
        }

        public Builder sizeInBytes(FileSystemSizeInByteGetArgs... sizeInBytes) {
            return sizeInBytes(List.of(sizeInBytes));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        public Builder throughputMode(@Nullable Output<String> throughputMode) {
            $.throughputMode = throughputMode;
            return this;
        }

        public Builder throughputMode(String throughputMode) {
            return throughputMode(Output.of(throughputMode));
        }

        public FileSystemState build() {
            return $;
        }
    }

}
