// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ssl configuration for scoring
 * 
 */
public final class SslConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final SslConfigurationResponse Empty = new SslConfigurationResponse();

    /**
     * Cert data
     * 
     */
    @Import(name="cert")
    private @Nullable String cert;

    public Optional<String> cert() {
        return Optional.ofNullable(this.cert);
    }

    /**
     * CNAME of the cert
     * 
     */
    @Import(name="cname")
    private @Nullable String cname;

    public Optional<String> cname() {
        return Optional.ofNullable(this.cname);
    }

    /**
     * Key data
     * 
     */
    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Enable or disable ssl for scoring
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    private SslConfigurationResponse() {}

    private SslConfigurationResponse(SslConfigurationResponse $) {
        this.cert = $.cert;
        this.cname = $.cname;
        this.key = $.key;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SslConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SslConfigurationResponse $;

        public Builder() {
            $ = new SslConfigurationResponse();
        }

        public Builder(SslConfigurationResponse defaults) {
            $ = new SslConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder cert(@Nullable String cert) {
            $.cert = cert;
            return this;
        }

        public Builder cname(@Nullable String cname) {
            $.cname = cname;
            return this;
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        public SslConfigurationResponse build() {
            return $;
        }
    }

}
