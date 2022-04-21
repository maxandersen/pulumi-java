// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.file_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * NFS export options specifications.
 * 
 */
public final class NfsExportOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final NfsExportOptionsResponse Empty = new NfsExportOptionsResponse();

    /**
     * Either READ_ONLY, for allowing only read requests on the exported directory, or READ_WRITE, for allowing both read and write requests. The default is READ_WRITE.
     * 
     */
    @Import(name="accessMode", required=true)
    private String accessMode;

    public String accessMode() {
        return this.accessMode;
    }

    /**
     * An integer representing the anonymous group id with a default value of 65534. Anon_gid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
     */
    @Import(name="anonGid", required=true)
    private String anonGid;

    public String anonGid() {
        return this.anonGid;
    }

    /**
     * An integer representing the anonymous user id with a default value of 65534. Anon_uid may only be set with squash_mode of ROOT_SQUASH. An error will be returned if this field is specified for other squash_mode settings.
     * 
     */
    @Import(name="anonUid", required=true)
    private String anonUid;

    public String anonUid() {
        return this.anonUid;
    }

    /**
     * List of either an IPv4 addresses in the format `{octet1}.{octet2}.{octet3}.{octet4}` or CIDR ranges in the format `{octet1}.{octet2}.{octet3}.{octet4}/{mask size}` which may mount the file share. Overlapping IP ranges are not allowed, both within and across NfsExportOptions. An error will be returned. The limit is 64 IP ranges/addresses for each FileShareConfig among all NfsExportOptions.
     * 
     */
    @Import(name="ipRanges", required=true)
    private List<String> ipRanges;

    public List<String> ipRanges() {
        return this.ipRanges;
    }

    /**
     * Either NO_ROOT_SQUASH, for allowing root access on the exported directory, or ROOT_SQUASH, for not allowing root access. The default is NO_ROOT_SQUASH.
     * 
     */
    @Import(name="squashMode", required=true)
    private String squashMode;

    public String squashMode() {
        return this.squashMode;
    }

    private NfsExportOptionsResponse() {}

    private NfsExportOptionsResponse(NfsExportOptionsResponse $) {
        this.accessMode = $.accessMode;
        this.anonGid = $.anonGid;
        this.anonUid = $.anonUid;
        this.ipRanges = $.ipRanges;
        this.squashMode = $.squashMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NfsExportOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NfsExportOptionsResponse $;

        public Builder() {
            $ = new NfsExportOptionsResponse();
        }

        public Builder(NfsExportOptionsResponse defaults) {
            $ = new NfsExportOptionsResponse(Objects.requireNonNull(defaults));
        }

        public Builder accessMode(String accessMode) {
            $.accessMode = accessMode;
            return this;
        }

        public Builder anonGid(String anonGid) {
            $.anonGid = anonGid;
            return this;
        }

        public Builder anonUid(String anonUid) {
            $.anonUid = anonUid;
            return this;
        }

        public Builder ipRanges(List<String> ipRanges) {
            $.ipRanges = ipRanges;
            return this;
        }

        public Builder ipRanges(String... ipRanges) {
            return ipRanges(List.of(ipRanges));
        }

        public Builder squashMode(String squashMode) {
            $.squashMode = squashMode;
            return this;
        }

        public NfsExportOptionsResponse build() {
            $.accessMode = Objects.requireNonNull($.accessMode, "expected parameter 'accessMode' to be non-null");
            $.anonGid = Objects.requireNonNull($.anonGid, "expected parameter 'anonGid' to be non-null");
            $.anonUid = Objects.requireNonNull($.anonUid, "expected parameter 'anonUid' to be non-null");
            $.ipRanges = Objects.requireNonNull($.ipRanges, "expected parameter 'ipRanges' to be non-null");
            $.squashMode = Objects.requireNonNull($.squashMode, "expected parameter 'squashMode' to be non-null");
            return $;
        }
    }

}
