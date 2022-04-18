// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyCorsConfig;
import com.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfig;
import com.pulumi.awsnative.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfig;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyConfig extends com.pulumi.resources.InvokeArgs {

    public static final ResponseHeadersPolicyConfig Empty = new ResponseHeadersPolicyConfig();

    @Import(name="comment")
      private final @Nullable String comment;

    public Optional<String> comment() {
        return this.comment == null ? Optional.empty() : Optional.ofNullable(this.comment);
    }

    @Import(name="corsConfig")
      private final @Nullable ResponseHeadersPolicyCorsConfig corsConfig;

    public Optional<ResponseHeadersPolicyCorsConfig> corsConfig() {
        return this.corsConfig == null ? Optional.empty() : Optional.ofNullable(this.corsConfig);
    }

    @Import(name="customHeadersConfig")
      private final @Nullable ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig;

    public Optional<ResponseHeadersPolicyCustomHeadersConfig> customHeadersConfig() {
        return this.customHeadersConfig == null ? Optional.empty() : Optional.ofNullable(this.customHeadersConfig);
    }

    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    @Import(name="securityHeadersConfig")
      private final @Nullable ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig;

    public Optional<ResponseHeadersPolicySecurityHeadersConfig> securityHeadersConfig() {
        return this.securityHeadersConfig == null ? Optional.empty() : Optional.ofNullable(this.securityHeadersConfig);
    }

    public ResponseHeadersPolicyConfig(
        @Nullable String comment,
        @Nullable ResponseHeadersPolicyCorsConfig corsConfig,
        @Nullable ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig,
        String name,
        @Nullable ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig) {
        this.comment = comment;
        this.corsConfig = corsConfig;
        this.customHeadersConfig = customHeadersConfig;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.securityHeadersConfig = securityHeadersConfig;
    }

    private ResponseHeadersPolicyConfig() {
        this.comment = null;
        this.corsConfig = null;
        this.customHeadersConfig = null;
        this.name = null;
        this.securityHeadersConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String comment;
        private @Nullable ResponseHeadersPolicyCorsConfig corsConfig;
        private @Nullable ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig;
        private String name;
        private @Nullable ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.corsConfig = defaults.corsConfig;
    	      this.customHeadersConfig = defaults.customHeadersConfig;
    	      this.name = defaults.name;
    	      this.securityHeadersConfig = defaults.securityHeadersConfig;
        }

        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        public Builder corsConfig(@Nullable ResponseHeadersPolicyCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public Builder customHeadersConfig(@Nullable ResponseHeadersPolicyCustomHeadersConfig customHeadersConfig) {
            this.customHeadersConfig = customHeadersConfig;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder securityHeadersConfig(@Nullable ResponseHeadersPolicySecurityHeadersConfig securityHeadersConfig) {
            this.securityHeadersConfig = securityHeadersConfig;
            return this;
        }        public ResponseHeadersPolicyConfig build() {
            return new ResponseHeadersPolicyConfig(comment, corsConfig, customHeadersConfig, name, securityHeadersConfig);
        }
    }
}
