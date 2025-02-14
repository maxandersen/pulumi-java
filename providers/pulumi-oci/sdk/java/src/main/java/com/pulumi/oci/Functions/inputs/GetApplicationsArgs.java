// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Functions.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Functions.inputs.GetApplicationsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationsArgs Empty = new GetApplicationsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this resource belongs.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this resource belongs.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * A filter to return only applications with display names that match the display name string. Matching is exact.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only applications with display names that match the display name string. Matching is exact.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetApplicationsFilter> filters;

    public Optional<List<GetApplicationsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return only applications with the specified OCID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return A filter to return only applications with the specified OCID.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A filter to return only applications that match the lifecycle state in this parameter. Example: `Creating`
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only applications that match the lifecycle state in this parameter. Example: `Creating`
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetApplicationsArgs() {}

    private GetApplicationsArgs(GetApplicationsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationsArgs $;

        public Builder() {
            $ = new GetApplicationsArgs();
        }

        public Builder(GetApplicationsArgs defaults) {
            $ = new GetApplicationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment to which this resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param displayName A filter to return only applications with display names that match the display name string. Matching is exact.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetApplicationsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetApplicationsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id A filter to return only applications with the specified OCID.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param state A filter to return only applications that match the lifecycle state in this parameter. Example: `Creating`
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetApplicationsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
