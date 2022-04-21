// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainNameMutualTlsAuthentication extends com.pulumi.resources.InvokeArgs {

    public static final DomainNameMutualTlsAuthentication Empty = new DomainNameMutualTlsAuthentication();

    @Import(name="truststoreUri")
    private @Nullable String truststoreUri;

    public Optional<String> truststoreUri() {
        return Optional.ofNullable(this.truststoreUri);
    }

    @Import(name="truststoreVersion")
    private @Nullable String truststoreVersion;

    public Optional<String> truststoreVersion() {
        return Optional.ofNullable(this.truststoreVersion);
    }

    private DomainNameMutualTlsAuthentication() {}

    private DomainNameMutualTlsAuthentication(DomainNameMutualTlsAuthentication $) {
        this.truststoreUri = $.truststoreUri;
        this.truststoreVersion = $.truststoreVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainNameMutualTlsAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainNameMutualTlsAuthentication $;

        public Builder() {
            $ = new DomainNameMutualTlsAuthentication();
        }

        public Builder(DomainNameMutualTlsAuthentication defaults) {
            $ = new DomainNameMutualTlsAuthentication(Objects.requireNonNull(defaults));
        }

        public Builder truststoreUri(@Nullable String truststoreUri) {
            $.truststoreUri = truststoreUri;
            return this;
        }

        public Builder truststoreVersion(@Nullable String truststoreVersion) {
            $.truststoreVersion = truststoreVersion;
            return this;
        }

        public DomainNameMutualTlsAuthentication build() {
            return $;
        }
    }

}
