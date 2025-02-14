// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Email.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Email.inputs.GetEmailDomainsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEmailDomainsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEmailDomainsArgs Empty = new GetEmailDomainsArgs();

    /**
     * The OCID for the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID for the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetEmailDomainsFilter> filters;

    public Optional<List<GetEmailDomainsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to only return resources that match the given id exactly.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return A filter to only return resources that match the given id exactly.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * A filter to only return resources that match the given name exactly.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return A filter to only return resources that match the given name exactly.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Filter returned list by specified lifecycle state. This parameter is case-insensitive.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Filter returned list by specified lifecycle state. This parameter is case-insensitive.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetEmailDomainsArgs() {}

    private GetEmailDomainsArgs(GetEmailDomainsArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.id = $.id;
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEmailDomainsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEmailDomainsArgs $;

        public Builder() {
            $ = new GetEmailDomainsArgs();
        }

        public Builder(GetEmailDomainsArgs defaults) {
            $ = new GetEmailDomainsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The OCID for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetEmailDomainsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetEmailDomainsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id A filter to only return resources that match the given id exactly.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name A filter to only return resources that match the given name exactly.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param state Filter returned list by specified lifecycle state. This parameter is case-insensitive.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetEmailDomainsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
