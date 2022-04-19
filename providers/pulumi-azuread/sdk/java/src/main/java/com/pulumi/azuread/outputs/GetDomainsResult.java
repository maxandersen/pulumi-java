// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.GetDomainsDomain;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDomainsResult {
    /**
     * Whether the DNS for the domain is managed by Microsoft 365.
     * 
     */
    private final @Nullable Boolean adminManaged;
    /**
     * A list of tenant domains. Each `domain` object provides the attributes documented below.
     * 
     */
    private final List<GetDomainsDomain> domains;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean includeUnverified;
    private final @Nullable Boolean onlyDefault;
    private final @Nullable Boolean onlyInitial;
    private final @Nullable Boolean onlyRoot;
    private final @Nullable List<String> supportsServices;

    @CustomType.Constructor
    private GetDomainsResult(
        @CustomType.Parameter("adminManaged") @Nullable Boolean adminManaged,
        @CustomType.Parameter("domains") List<GetDomainsDomain> domains,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("includeUnverified") @Nullable Boolean includeUnverified,
        @CustomType.Parameter("onlyDefault") @Nullable Boolean onlyDefault,
        @CustomType.Parameter("onlyInitial") @Nullable Boolean onlyInitial,
        @CustomType.Parameter("onlyRoot") @Nullable Boolean onlyRoot,
        @CustomType.Parameter("supportsServices") @Nullable List<String> supportsServices) {
        this.adminManaged = adminManaged;
        this.domains = domains;
        this.id = id;
        this.includeUnverified = includeUnverified;
        this.onlyDefault = onlyDefault;
        this.onlyInitial = onlyInitial;
        this.onlyRoot = onlyRoot;
        this.supportsServices = supportsServices;
    }

    /**
     * Whether the DNS for the domain is managed by Microsoft 365.
     * 
    */
    public Optional<Boolean> adminManaged() {
        return Optional.ofNullable(this.adminManaged);
    }
    /**
     * A list of tenant domains. Each `domain` object provides the attributes documented below.
     * 
    */
    public List<GetDomainsDomain> domains() {
        return this.domains;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> includeUnverified() {
        return Optional.ofNullable(this.includeUnverified);
    }
    public Optional<Boolean> onlyDefault() {
        return Optional.ofNullable(this.onlyDefault);
    }
    public Optional<Boolean> onlyInitial() {
        return Optional.ofNullable(this.onlyInitial);
    }
    public Optional<Boolean> onlyRoot() {
        return Optional.ofNullable(this.onlyRoot);
    }
    public List<String> supportsServices() {
        return this.supportsServices == null ? List.of() : this.supportsServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean adminManaged;
        private List<GetDomainsDomain> domains;
        private String id;
        private @Nullable Boolean includeUnverified;
        private @Nullable Boolean onlyDefault;
        private @Nullable Boolean onlyInitial;
        private @Nullable Boolean onlyRoot;
        private @Nullable List<String> supportsServices;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminManaged = defaults.adminManaged;
    	      this.domains = defaults.domains;
    	      this.id = defaults.id;
    	      this.includeUnverified = defaults.includeUnverified;
    	      this.onlyDefault = defaults.onlyDefault;
    	      this.onlyInitial = defaults.onlyInitial;
    	      this.onlyRoot = defaults.onlyRoot;
    	      this.supportsServices = defaults.supportsServices;
        }

        public Builder adminManaged(@Nullable Boolean adminManaged) {
            this.adminManaged = adminManaged;
            return this;
        }
        public Builder domains(List<GetDomainsDomain> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }
        public Builder domains(GetDomainsDomain... domains) {
            return domains(List.of(domains));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder includeUnverified(@Nullable Boolean includeUnverified) {
            this.includeUnverified = includeUnverified;
            return this;
        }
        public Builder onlyDefault(@Nullable Boolean onlyDefault) {
            this.onlyDefault = onlyDefault;
            return this;
        }
        public Builder onlyInitial(@Nullable Boolean onlyInitial) {
            this.onlyInitial = onlyInitial;
            return this;
        }
        public Builder onlyRoot(@Nullable Boolean onlyRoot) {
            this.onlyRoot = onlyRoot;
            return this;
        }
        public Builder supportsServices(@Nullable List<String> supportsServices) {
            this.supportsServices = supportsServices;
            return this;
        }
        public Builder supportsServices(String... supportsServices) {
            return supportsServices(List.of(supportsServices));
        }        public GetDomainsResult build() {
            return new GetDomainsResult(adminManaged, domains, id, includeUnverified, onlyDefault, onlyInitial, onlyRoot, supportsServices);
        }
    }
}
