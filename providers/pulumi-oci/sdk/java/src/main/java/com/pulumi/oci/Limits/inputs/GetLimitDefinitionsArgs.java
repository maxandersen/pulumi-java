// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Limits.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Limits.inputs.GetLimitDefinitionsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLimitDefinitionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLimitDefinitionsArgs Empty = new GetLimitDefinitionsArgs();

    /**
     * The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetLimitDefinitionsFilter> filters;

    public Optional<List<GetLimitDefinitionsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Optional field, filter for a specific resource limit.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Optional field, filter for a specific resource limit.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The target service name.
     * 
     */
    @Import(name="serviceName")
    private @Nullable String serviceName;

    /**
     * @return The target service name.
     * 
     */
    public Optional<String> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    private GetLimitDefinitionsArgs() {}

    private GetLimitDefinitionsArgs(GetLimitDefinitionsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.name = $.name;
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLimitDefinitionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLimitDefinitionsArgs $;

        public Builder() {
            $ = new GetLimitDefinitionsArgs();
        }

        public Builder(GetLimitDefinitionsArgs defaults) {
            $ = new GetLimitDefinitionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID of the parent compartment (remember that the tenancy is simply the root compartment).
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetLimitDefinitionsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetLimitDefinitionsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name Optional field, filter for a specific resource limit.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param serviceName The target service name.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public GetLimitDefinitionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
