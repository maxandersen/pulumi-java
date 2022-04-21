// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFileSharesNfsExportOptionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFileSharesNfsExportOptionGetArgs Empty = new InstanceFileSharesNfsExportOptionGetArgs();

    /**
     * Either READ_ONLY, for allowing only read requests on the exported directory,
     * or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    @Import(name="accessMode")
    private @Nullable Output<String> accessMode;

    public Optional<Output<String>> accessMode() {
        return Optional.ofNullable(this.accessMode);
    }

    /**
     * An integer representing the anonymous group id with a default value of 65534.
     * Anon_gid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    @Import(name="anonGid")
    private @Nullable Output<Integer> anonGid;

    public Optional<Output<Integer>> anonGid() {
        return Optional.ofNullable(this.anonGid);
    }

    /**
     * An integer representing the anonymous user id with a default value of 65534.
     * Anon_uid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    @Import(name="anonUid")
    private @Nullable Output<Integer> anonUid;

    public Optional<Output<Integer>> anonUid() {
        return Optional.ofNullable(this.anonUid);
    }

    /**
     * List of either IPv4 addresses, or ranges in CIDR notation which may mount the file share.
     * Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned.
     * The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
     */
    @Import(name="ipRanges")
    private @Nullable Output<List<String>> ipRanges;

    public Optional<Output<List<String>>> ipRanges() {
        return Optional.ofNullable(this.ipRanges);
    }

    /**
     * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH,
     * for not allowing root access. The default is NO_ROOT_SQUASH.
     * Default value is `NO_ROOT_SQUASH`.
     * Possible values are `NO_ROOT_SQUASH` and `ROOT_SQUASH`.
     * 
     */
    @Import(name="squashMode")
    private @Nullable Output<String> squashMode;

    public Optional<Output<String>> squashMode() {
        return Optional.ofNullable(this.squashMode);
    }

    private InstanceFileSharesNfsExportOptionGetArgs() {}

    private InstanceFileSharesNfsExportOptionGetArgs(InstanceFileSharesNfsExportOptionGetArgs $) {
        this.accessMode = $.accessMode;
        this.anonGid = $.anonGid;
        this.anonUid = $.anonUid;
        this.ipRanges = $.ipRanges;
        this.squashMode = $.squashMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFileSharesNfsExportOptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFileSharesNfsExportOptionGetArgs $;

        public Builder() {
            $ = new InstanceFileSharesNfsExportOptionGetArgs();
        }

        public Builder(InstanceFileSharesNfsExportOptionGetArgs defaults) {
            $ = new InstanceFileSharesNfsExportOptionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessMode(@Nullable Output<String> accessMode) {
            $.accessMode = accessMode;
            return this;
        }

        public Builder accessMode(String accessMode) {
            return accessMode(Output.of(accessMode));
        }

        public Builder anonGid(@Nullable Output<Integer> anonGid) {
            $.anonGid = anonGid;
            return this;
        }

        public Builder anonGid(Integer anonGid) {
            return anonGid(Output.of(anonGid));
        }

        public Builder anonUid(@Nullable Output<Integer> anonUid) {
            $.anonUid = anonUid;
            return this;
        }

        public Builder anonUid(Integer anonUid) {
            return anonUid(Output.of(anonUid));
        }

        public Builder ipRanges(@Nullable Output<List<String>> ipRanges) {
            $.ipRanges = ipRanges;
            return this;
        }

        public Builder ipRanges(List<String> ipRanges) {
            return ipRanges(Output.of(ipRanges));
        }

        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }

        public Builder squashMode(@Nullable Output<String> squashMode) {
            $.squashMode = squashMode;
            return this;
        }

        public Builder squashMode(String squashMode) {
            return squashMode(Output.of(squashMode));
        }

        public InstanceFileSharesNfsExportOptionGetArgs build() {
            return $;
        }
    }

}
