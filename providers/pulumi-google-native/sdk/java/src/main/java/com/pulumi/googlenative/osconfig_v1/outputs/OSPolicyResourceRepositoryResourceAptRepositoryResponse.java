// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceRepositoryResourceAptRepositoryResponse {
    /**
     * Type of archive files in this repository.
     * 
     */
    private final String archiveType;
    /**
     * List of components for this repository. Must contain at least one item.
     * 
     */
    private final List<String> components;
    /**
     * Distribution of this repository.
     * 
     */
    private final String distribution;
    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
     */
    private final String gpgKey;
    /**
     * URI for this repository.
     * 
     */
    private final String uri;

    @CustomType.Constructor
    private OSPolicyResourceRepositoryResourceAptRepositoryResponse(
        @CustomType.Parameter("archiveType") String archiveType,
        @CustomType.Parameter("components") List<String> components,
        @CustomType.Parameter("distribution") String distribution,
        @CustomType.Parameter("gpgKey") String gpgKey,
        @CustomType.Parameter("uri") String uri) {
        this.archiveType = archiveType;
        this.components = components;
        this.distribution = distribution;
        this.gpgKey = gpgKey;
        this.uri = uri;
    }

    /**
     * Type of archive files in this repository.
     * 
    */
    public String archiveType() {
        return this.archiveType;
    }
    /**
     * List of components for this repository. Must contain at least one item.
     * 
    */
    public List<String> components() {
        return this.components;
    }
    /**
     * Distribution of this repository.
     * 
    */
    public String distribution() {
        return this.distribution;
    }
    /**
     * URI of the key file for this repository. The agent maintains a keyring at `/etc/apt/trusted.gpg.d/osconfig_agent_managed.gpg`.
     * 
    */
    public String gpgKey() {
        return this.gpgKey;
    }
    /**
     * URI for this repository.
     * 
    */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceRepositoryResourceAptRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String archiveType;
        private List<String> components;
        private String distribution;
        private String gpgKey;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceRepositoryResourceAptRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveType = defaults.archiveType;
    	      this.components = defaults.components;
    	      this.distribution = defaults.distribution;
    	      this.gpgKey = defaults.gpgKey;
    	      this.uri = defaults.uri;
        }

        public Builder archiveType(String archiveType) {
            this.archiveType = Objects.requireNonNull(archiveType);
            return this;
        }
        public Builder components(List<String> components) {
            this.components = Objects.requireNonNull(components);
            return this;
        }
        public Builder components(String... components) {
            return components(List.of(components));
        }
        public Builder distribution(String distribution) {
            this.distribution = Objects.requireNonNull(distribution);
            return this;
        }
        public Builder gpgKey(String gpgKey) {
            this.gpgKey = Objects.requireNonNull(gpgKey);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }        public OSPolicyResourceRepositoryResourceAptRepositoryResponse build() {
            return new OSPolicyResourceRepositoryResourceAptRepositoryResponse(archiveType, components, distribution, gpgKey, uri);
        }
    }
}
