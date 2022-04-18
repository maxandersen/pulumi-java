// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.appengine_v1alpha.inputs.SslSettingsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainMappingArgs Empty = new DomainMappingArgs();

    @Import(name="appId", required=true)
      private final Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * Relative name of the domain serving the application. Example: example.com.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    @Import(name="noManagedCertificate")
      private final @Nullable Output<String> noManagedCertificate;

    public Output<String> noManagedCertificate() {
        return this.noManagedCertificate == null ? Codegen.empty() : this.noManagedCertificate;
    }

    @Import(name="overrideStrategy")
      private final @Nullable Output<String> overrideStrategy;

    public Output<String> overrideStrategy() {
        return this.overrideStrategy == null ? Codegen.empty() : this.overrideStrategy;
    }

    /**
     * SSL configuration for this domain. If unconfigured, this domain will not serve with SSL.
     * 
     */
    @Import(name="sslSettings")
      private final @Nullable Output<SslSettingsArgs> sslSettings;

    public Output<SslSettingsArgs> sslSettings() {
        return this.sslSettings == null ? Codegen.empty() : this.sslSettings;
    }

    public DomainMappingArgs(
        Output<String> appId,
        @Nullable Output<String> id,
        @Nullable Output<String> noManagedCertificate,
        @Nullable Output<String> overrideStrategy,
        @Nullable Output<SslSettingsArgs> sslSettings) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.id = id;
        this.noManagedCertificate = noManagedCertificate;
        this.overrideStrategy = overrideStrategy;
        this.sslSettings = sslSettings;
    }

    private DomainMappingArgs() {
        this.appId = Codegen.empty();
        this.id = Codegen.empty();
        this.noManagedCertificate = Codegen.empty();
        this.overrideStrategy = Codegen.empty();
        this.sslSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appId;
        private @Nullable Output<String> id;
        private @Nullable Output<String> noManagedCertificate;
        private @Nullable Output<String> overrideStrategy;
        private @Nullable Output<SslSettingsArgs> sslSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.id = defaults.id;
    	      this.noManagedCertificate = defaults.noManagedCertificate;
    	      this.overrideStrategy = defaults.overrideStrategy;
    	      this.sslSettings = defaults.sslSettings;
        }

        public Builder appId(Output<String> appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder appId(String appId) {
            this.appId = Output.of(Objects.requireNonNull(appId));
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder noManagedCertificate(@Nullable Output<String> noManagedCertificate) {
            this.noManagedCertificate = noManagedCertificate;
            return this;
        }
        public Builder noManagedCertificate(@Nullable String noManagedCertificate) {
            this.noManagedCertificate = Codegen.ofNullable(noManagedCertificate);
            return this;
        }
        public Builder overrideStrategy(@Nullable Output<String> overrideStrategy) {
            this.overrideStrategy = overrideStrategy;
            return this;
        }
        public Builder overrideStrategy(@Nullable String overrideStrategy) {
            this.overrideStrategy = Codegen.ofNullable(overrideStrategy);
            return this;
        }
        public Builder sslSettings(@Nullable Output<SslSettingsArgs> sslSettings) {
            this.sslSettings = sslSettings;
            return this;
        }
        public Builder sslSettings(@Nullable SslSettingsArgs sslSettings) {
            this.sslSettings = Codegen.ofNullable(sslSettings);
            return this;
        }        public DomainMappingArgs build() {
            return new DomainMappingArgs(appId, id, noManagedCertificate, overrideStrategy, sslSettings);
        }
    }
}
