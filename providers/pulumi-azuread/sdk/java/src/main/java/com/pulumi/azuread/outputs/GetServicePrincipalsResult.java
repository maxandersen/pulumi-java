// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azuread.outputs;

import com.pulumi.azuread.outputs.GetServicePrincipalsServicePrincipal;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServicePrincipalsResult {
    /**
     * @return A list of application IDs (client IDs) of the applications associated with the service principals.
     * 
     */
    private final List<String> applicationIds;
    /**
     * @return A list of display names of the applications associated with the service principals.
     * 
     */
    private final List<String> displayNames;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean ignoreMissing;
    /**
     * @return The object IDs of the service principals.
     * 
     */
    private final List<String> objectIds;
    private final @Nullable Boolean returnAll;
    /**
     * @return A list of service principals. Each `service_principal` object provides the attributes documented below.
     * 
     */
    private final List<GetServicePrincipalsServicePrincipal> servicePrincipals;

    @CustomType.Constructor
    private GetServicePrincipalsResult(
        @CustomType.Parameter("applicationIds") List<String> applicationIds,
        @CustomType.Parameter("displayNames") List<String> displayNames,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ignoreMissing") @Nullable Boolean ignoreMissing,
        @CustomType.Parameter("objectIds") List<String> objectIds,
        @CustomType.Parameter("returnAll") @Nullable Boolean returnAll,
        @CustomType.Parameter("servicePrincipals") List<GetServicePrincipalsServicePrincipal> servicePrincipals) {
        this.applicationIds = applicationIds;
        this.displayNames = displayNames;
        this.id = id;
        this.ignoreMissing = ignoreMissing;
        this.objectIds = objectIds;
        this.returnAll = returnAll;
        this.servicePrincipals = servicePrincipals;
    }

    /**
     * @return A list of application IDs (client IDs) of the applications associated with the service principals.
     * 
     */
    public List<String> applicationIds() {
        return this.applicationIds;
    }
    /**
     * @return A list of display names of the applications associated with the service principals.
     * 
     */
    public List<String> displayNames() {
        return this.displayNames;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> ignoreMissing() {
        return Optional.ofNullable(this.ignoreMissing);
    }
    /**
     * @return The object IDs of the service principals.
     * 
     */
    public List<String> objectIds() {
        return this.objectIds;
    }
    public Optional<Boolean> returnAll() {
        return Optional.ofNullable(this.returnAll);
    }
    /**
     * @return A list of service principals. Each `service_principal` object provides the attributes documented below.
     * 
     */
    public List<GetServicePrincipalsServicePrincipal> servicePrincipals() {
        return this.servicePrincipals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServicePrincipalsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> applicationIds;
        private List<String> displayNames;
        private String id;
        private @Nullable Boolean ignoreMissing;
        private List<String> objectIds;
        private @Nullable Boolean returnAll;
        private List<GetServicePrincipalsServicePrincipal> servicePrincipals;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServicePrincipalsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationIds = defaults.applicationIds;
    	      this.displayNames = defaults.displayNames;
    	      this.id = defaults.id;
    	      this.ignoreMissing = defaults.ignoreMissing;
    	      this.objectIds = defaults.objectIds;
    	      this.returnAll = defaults.returnAll;
    	      this.servicePrincipals = defaults.servicePrincipals;
        }

        public Builder applicationIds(List<String> applicationIds) {
            this.applicationIds = Objects.requireNonNull(applicationIds);
            return this;
        }
        public Builder applicationIds(String... applicationIds) {
            return applicationIds(List.of(applicationIds));
        }
        public Builder displayNames(List<String> displayNames) {
            this.displayNames = Objects.requireNonNull(displayNames);
            return this;
        }
        public Builder displayNames(String... displayNames) {
            return displayNames(List.of(displayNames));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ignoreMissing(@Nullable Boolean ignoreMissing) {
            this.ignoreMissing = ignoreMissing;
            return this;
        }
        public Builder objectIds(List<String> objectIds) {
            this.objectIds = Objects.requireNonNull(objectIds);
            return this;
        }
        public Builder objectIds(String... objectIds) {
            return objectIds(List.of(objectIds));
        }
        public Builder returnAll(@Nullable Boolean returnAll) {
            this.returnAll = returnAll;
            return this;
        }
        public Builder servicePrincipals(List<GetServicePrincipalsServicePrincipal> servicePrincipals) {
            this.servicePrincipals = Objects.requireNonNull(servicePrincipals);
            return this;
        }
        public Builder servicePrincipals(GetServicePrincipalsServicePrincipal... servicePrincipals) {
            return servicePrincipals(List.of(servicePrincipals));
        }        public GetServicePrincipalsResult build() {
            return new GetServicePrincipalsResult(applicationIds, displayNames, id, ignoreMissing, objectIds, returnAll, servicePrincipals);
        }
    }
}
