// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.filestore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceFileSharesNfsExportOption {
    /**
     * @return Either READ_ONLY, for allowing only read requests on the exported directory,
     * or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    private final @Nullable String accessMode;
    /**
     * @return An integer representing the anonymous group id with a default value of 65534.
     * Anon_gid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    private final @Nullable Integer anonGid;
    /**
     * @return An integer representing the anonymous user id with a default value of 65534.
     * Anon_uid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    private final @Nullable Integer anonUid;
    /**
     * @return List of either IPv4 addresses, or ranges in CIDR notation which may mount the file share.
     * Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned.
     * The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
     */
    private final @Nullable List<String> ipRanges;
    /**
     * @return Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH,
     * for not allowing root access. The default is NO_ROOT_SQUASH.
     * Default value is `NO_ROOT_SQUASH`.
     * Possible values are `NO_ROOT_SQUASH` and `ROOT_SQUASH`.
     * 
     */
    private final @Nullable String squashMode;

    @CustomType.Constructor
    private InstanceFileSharesNfsExportOption(
        @CustomType.Parameter("accessMode") @Nullable String accessMode,
        @CustomType.Parameter("anonGid") @Nullable Integer anonGid,
        @CustomType.Parameter("anonUid") @Nullable Integer anonUid,
        @CustomType.Parameter("ipRanges") @Nullable List<String> ipRanges,
        @CustomType.Parameter("squashMode") @Nullable String squashMode) {
        this.accessMode = accessMode;
        this.anonGid = anonGid;
        this.anonUid = anonUid;
        this.ipRanges = ipRanges;
        this.squashMode = squashMode;
    }

    /**
     * @return Either READ_ONLY, for allowing only read requests on the exported directory,
     * or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * Default value is `READ_WRITE`.
     * Possible values are `READ_ONLY` and `READ_WRITE`.
     * 
     */
    public Optional<String> accessMode() {
        return Optional.ofNullable(this.accessMode);
    }
    /**
     * @return An integer representing the anonymous group id with a default value of 65534.
     * Anon_gid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    public Optional<Integer> anonGid() {
        return Optional.ofNullable(this.anonGid);
    }
    /**
     * @return An integer representing the anonymous user id with a default value of 65534.
     * Anon_uid may only be set with squashMode of ROOT_SQUASH. An error will be returned
     * if this field is specified for other squashMode settings.
     * 
     */
    public Optional<Integer> anonUid() {
        return Optional.ofNullable(this.anonUid);
    }
    /**
     * @return List of either IPv4 addresses, or ranges in CIDR notation which may mount the file share.
     * Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned.
     * The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
     */
    public List<String> ipRanges() {
        return this.ipRanges == null ? List.of() : this.ipRanges;
    }
    /**
     * @return Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH,
     * for not allowing root access. The default is NO_ROOT_SQUASH.
     * Default value is `NO_ROOT_SQUASH`.
     * Possible values are `NO_ROOT_SQUASH` and `ROOT_SQUASH`.
     * 
     */
    public Optional<String> squashMode() {
        return Optional.ofNullable(this.squashMode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFileSharesNfsExportOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessMode;
        private @Nullable Integer anonGid;
        private @Nullable Integer anonUid;
        private @Nullable List<String> ipRanges;
        private @Nullable String squashMode;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFileSharesNfsExportOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessMode = defaults.accessMode;
    	      this.anonGid = defaults.anonGid;
    	      this.anonUid = defaults.anonUid;
    	      this.ipRanges = defaults.ipRanges;
    	      this.squashMode = defaults.squashMode;
        }

        public Builder accessMode(@Nullable String accessMode) {
            this.accessMode = accessMode;
            return this;
        }
        public Builder anonGid(@Nullable Integer anonGid) {
            this.anonGid = anonGid;
            return this;
        }
        public Builder anonUid(@Nullable Integer anonUid) {
            this.anonUid = anonUid;
            return this;
        }
        public Builder ipRanges(@Nullable List<String> ipRanges) {
            this.ipRanges = ipRanges;
            return this;
        }
        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }
        public Builder squashMode(@Nullable String squashMode) {
            this.squashMode = squashMode;
            return this;
        }        public InstanceFileSharesNfsExportOption build() {
            return new InstanceFileSharesNfsExportOption(accessMode, anonGid, anonUid, ipRanges, squashMode);
        }
    }
}
