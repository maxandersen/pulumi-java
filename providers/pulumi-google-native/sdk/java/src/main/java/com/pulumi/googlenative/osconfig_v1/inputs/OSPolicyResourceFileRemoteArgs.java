// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies a file available via some URI.
 * 
 */
public final class OSPolicyResourceFileRemoteArgs extends com.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileRemoteArgs Empty = new OSPolicyResourceFileRemoteArgs();

    /**
     * SHA256 checksum of the remote file.
     * 
     */
    @Import(name="sha256Checksum")
    private @Nullable Output<String> sha256Checksum;

    public Optional<Output<String>> sha256Checksum() {
        return Optional.ofNullable(this.sha256Checksum);
    }

    /**
     * URI from which to fetch the object. It should contain both the protocol and path following the format `{protocol}://{location}`.
     * 
     */
    @Import(name="uri", required=true)
    private Output<String> uri;

    public Output<String> uri() {
        return this.uri;
    }

    private OSPolicyResourceFileRemoteArgs() {}

    private OSPolicyResourceFileRemoteArgs(OSPolicyResourceFileRemoteArgs $) {
        this.sha256Checksum = $.sha256Checksum;
        this.uri = $.uri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OSPolicyResourceFileRemoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OSPolicyResourceFileRemoteArgs $;

        public Builder() {
            $ = new OSPolicyResourceFileRemoteArgs();
        }

        public Builder(OSPolicyResourceFileRemoteArgs defaults) {
            $ = new OSPolicyResourceFileRemoteArgs(Objects.requireNonNull(defaults));
        }

        public Builder sha256Checksum(@Nullable Output<String> sha256Checksum) {
            $.sha256Checksum = sha256Checksum;
            return this;
        }

        public Builder sha256Checksum(String sha256Checksum) {
            return sha256Checksum(Output.of(sha256Checksum));
        }

        public Builder uri(Output<String> uri) {
            $.uri = uri;
            return this;
        }

        public Builder uri(String uri) {
            return uri(Output.of(uri));
        }

        public OSPolicyResourceFileRemoteArgs build() {
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            return $;
        }
    }

}
