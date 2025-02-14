// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Email.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Email.inputs.GetDkimsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDkimsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDkimsArgs Empty = new GetDkimsArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain to which this DKIM belongs.
     * 
     */
    @Import(name="emailDomainId", required=true)
    private String emailDomainId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain to which this DKIM belongs.
     * 
     */
    public String emailDomainId() {
        return this.emailDomainId;
    }

    @Import(name="filters")
    private @Nullable List<GetDkimsFilter> filters;

    public Optional<List<GetDkimsFilter>> filters() {
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

    private GetDkimsArgs() {}

    private GetDkimsArgs(GetDkimsArgs $) {
        this.emailDomainId = $.emailDomainId;
        this.filters = $.filters;
        this.id = $.id;
        this.name = $.name;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDkimsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDkimsArgs $;

        public Builder() {
            $ = new GetDkimsArgs();
        }

        public Builder(GetDkimsArgs defaults) {
            $ = new GetDkimsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param emailDomainId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the email domain to which this DKIM belongs.
         * 
         * @return builder
         * 
         */
        public Builder emailDomainId(String emailDomainId) {
            $.emailDomainId = emailDomainId;
            return this;
        }

        public Builder filters(@Nullable List<GetDkimsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetDkimsFilter... filters) {
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

        public GetDkimsArgs build() {
            $.emailDomainId = Objects.requireNonNull($.emailDomainId, "expected parameter 'emailDomainId' to be non-null");
            return $;
        }
    }

}
