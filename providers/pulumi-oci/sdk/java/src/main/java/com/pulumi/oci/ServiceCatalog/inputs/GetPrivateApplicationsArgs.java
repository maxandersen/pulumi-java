// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ServiceCatalog.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.ServiceCatalog.inputs.GetPrivateApplicationsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPrivateApplicationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPrivateApplicationsArgs Empty = new GetPrivateApplicationsArgs();

    /**
     * The unique identifier for the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * Exact match name filter.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return Exact match name filter.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetPrivateApplicationsFilter> filters;

    public Optional<List<GetPrivateApplicationsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The unique identifier for the private application.
     * 
     */
    @Import(name="privateApplicationId")
    private @Nullable String privateApplicationId;

    /**
     * @return The unique identifier for the private application.
     * 
     */
    public Optional<String> privateApplicationId() {
        return Optional.ofNullable(this.privateApplicationId);
    }

    private GetPrivateApplicationsArgs() {}

    private GetPrivateApplicationsArgs(GetPrivateApplicationsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.privateApplicationId = $.privateApplicationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPrivateApplicationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPrivateApplicationsArgs $;

        public Builder() {
            $ = new GetPrivateApplicationsArgs();
        }

        public Builder(GetPrivateApplicationsArgs defaults) {
            $ = new GetPrivateApplicationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName Exact match name filter.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetPrivateApplicationsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetPrivateApplicationsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param privateApplicationId The unique identifier for the private application.
         * 
         * @return builder
         * 
         */
        public Builder privateApplicationId(@Nullable String privateApplicationId) {
            $.privateApplicationId = privateApplicationId;
            return this;
        }

        public GetPrivateApplicationsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
