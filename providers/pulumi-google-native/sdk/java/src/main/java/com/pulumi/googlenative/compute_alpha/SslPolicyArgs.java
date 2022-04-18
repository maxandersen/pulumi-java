// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.SslPolicyMinTlsVersion;
import com.pulumi.googlenative.compute_alpha.enums.SslPolicyProfile;
import com.pulumi.googlenative.compute_alpha.inputs.ServerTlsSettingsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SslPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SslPolicyArgs Empty = new SslPolicyArgs();

    /**
     * A list of features enabled when the selected profile is CUSTOM. The method returns the set of features that can be specified in this list. This field must be empty if the profile is not CUSTOM.
     * 
     */
    @Import(name="customFeatures")
      private final @Nullable Output<List<String>> customFeatures;

    public Output<List<String>> customFeatures() {
        return this.customFeatures == null ? Codegen.empty() : this.customFeatures;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The minimum version of SSL protocol that can be used by the clients to establish a connection with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.
     * 
     */
    @Import(name="minTlsVersion")
      private final @Nullable Output<SslPolicyMinTlsVersion> minTlsVersion;

    public Output<SslPolicyMinTlsVersion> minTlsVersion() {
        return this.minTlsVersion == null ? Codegen.empty() : this.minTlsVersion;
    }

    /**
     * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Profile specifies the set of SSL features that can be used by the load balancer when negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.
     * 
     */
    @Import(name="profile")
      private final @Nullable Output<SslPolicyProfile> profile;

    public Output<SslPolicyProfile> profile() {
        return this.profile == null ? Codegen.empty() : this.profile;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Security settings for the proxy. This field is only applicable to a global backend service with the loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="tlsSettings")
      private final @Nullable Output<ServerTlsSettingsArgs> tlsSettings;

    public Output<ServerTlsSettingsArgs> tlsSettings() {
        return this.tlsSettings == null ? Codegen.empty() : this.tlsSettings;
    }

    public SslPolicyArgs(
        @Nullable Output<List<String>> customFeatures,
        @Nullable Output<String> description,
        @Nullable Output<SslPolicyMinTlsVersion> minTlsVersion,
        @Nullable Output<String> name,
        @Nullable Output<SslPolicyProfile> profile,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<ServerTlsSettingsArgs> tlsSettings) {
        this.customFeatures = customFeatures;
        this.description = description;
        this.minTlsVersion = minTlsVersion;
        this.name = name;
        this.profile = profile;
        this.project = project;
        this.requestId = requestId;
        this.tlsSettings = tlsSettings;
    }

    private SslPolicyArgs() {
        this.customFeatures = Codegen.empty();
        this.description = Codegen.empty();
        this.minTlsVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.profile = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.tlsSettings = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> customFeatures;
        private @Nullable Output<String> description;
        private @Nullable Output<SslPolicyMinTlsVersion> minTlsVersion;
        private @Nullable Output<String> name;
        private @Nullable Output<SslPolicyProfile> profile;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<ServerTlsSettingsArgs> tlsSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SslPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customFeatures = defaults.customFeatures;
    	      this.description = defaults.description;
    	      this.minTlsVersion = defaults.minTlsVersion;
    	      this.name = defaults.name;
    	      this.profile = defaults.profile;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.tlsSettings = defaults.tlsSettings;
        }

        public Builder customFeatures(@Nullable Output<List<String>> customFeatures) {
            this.customFeatures = customFeatures;
            return this;
        }
        public Builder customFeatures(@Nullable List<String> customFeatures) {
            this.customFeatures = Codegen.ofNullable(customFeatures);
            return this;
        }
        public Builder customFeatures(String... customFeatures) {
            return customFeatures(List.of(customFeatures));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder minTlsVersion(@Nullable Output<SslPolicyMinTlsVersion> minTlsVersion) {
            this.minTlsVersion = minTlsVersion;
            return this;
        }
        public Builder minTlsVersion(@Nullable SslPolicyMinTlsVersion minTlsVersion) {
            this.minTlsVersion = Codegen.ofNullable(minTlsVersion);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder profile(@Nullable Output<SslPolicyProfile> profile) {
            this.profile = profile;
            return this;
        }
        public Builder profile(@Nullable SslPolicyProfile profile) {
            this.profile = Codegen.ofNullable(profile);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder tlsSettings(@Nullable Output<ServerTlsSettingsArgs> tlsSettings) {
            this.tlsSettings = tlsSettings;
            return this;
        }
        public Builder tlsSettings(@Nullable ServerTlsSettingsArgs tlsSettings) {
            this.tlsSettings = Codegen.ofNullable(tlsSettings);
            return this;
        }        public SslPolicyArgs build() {
            return new SslPolicyArgs(customFeatures, description, minTlsVersion, name, profile, project, requestId, tlsSettings);
        }
    }
}
