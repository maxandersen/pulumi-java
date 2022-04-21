// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeysZoneSigningKeyDigest extends com.pulumi.resources.InvokeArgs {

    public static final GetKeysZoneSigningKeyDigest Empty = new GetKeysZoneSigningKeyDigest();

    /**
     * The base-16 encoded bytes of this digest. Suitable for use in a DS resource record.
     * 
     */
    @Import(name="digest")
    private @Nullable String digest;

    public Optional<String> digest() {
        return Optional.ofNullable(this.digest);
    }

    /**
     * Specifies the algorithm used to calculate this digest. Possible values are `sha1`, `sha256` and `sha384`
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetKeysZoneSigningKeyDigest() {}

    private GetKeysZoneSigningKeyDigest(GetKeysZoneSigningKeyDigest $) {
        this.digest = $.digest;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeysZoneSigningKeyDigest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeysZoneSigningKeyDigest $;

        public Builder() {
            $ = new GetKeysZoneSigningKeyDigest();
        }

        public Builder(GetKeysZoneSigningKeyDigest defaults) {
            $ = new GetKeysZoneSigningKeyDigest(Objects.requireNonNull(defaults));
        }

        public Builder digest(@Nullable String digest) {
            $.digest = digest;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetKeysZoneSigningKeyDigest build() {
            return $;
        }
    }

}
