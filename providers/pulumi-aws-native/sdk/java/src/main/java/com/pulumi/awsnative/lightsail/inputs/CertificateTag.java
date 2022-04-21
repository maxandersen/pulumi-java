// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A key-value pair to associate with a resource.
 * 
 */
public final class CertificateTag extends com.pulumi.resources.InvokeArgs {

    public static final CertificateTag Empty = new CertificateTag();

    /**
     * The key name of the tag. You can specify a value that is 1 to 128 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    public String key() {
        return this.key;
    }

    /**
     * The value for the tag. You can specify a value that is 0 to 256 Unicode characters in length and cannot be prefixed with aws:. You can use any of the following characters: the set of Unicode letters, digits, whitespace, _, ., /, =, +, and -.
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private CertificateTag() {}

    private CertificateTag(CertificateTag $) {
        this.key = $.key;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateTag $;

        public Builder() {
            $ = new CertificateTag();
        }

        public Builder(CertificateTag defaults) {
            $ = new CertificateTag(Objects.requireNonNull(defaults));
        }

        public Builder key(String key) {
            $.key = key;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public CertificateTag build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            return $;
        }
    }

}
