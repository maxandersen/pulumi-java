// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.LogAnalytics.inputs.GetLogAnalyticsObjectCollectionRulesFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogAnalyticsObjectCollectionRulesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogAnalyticsObjectCollectionRulesArgs Empty = new GetLogAnalyticsObjectCollectionRulesArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable List<GetLogAnalyticsObjectCollectionRulesFilter> filters;

    public Optional<List<GetLogAnalyticsObjectCollectionRulesFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * A filter to return rules only matching with this name.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return A filter to return rules only matching with this name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Logging Analytics namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The Logging Analytics namespace used for the request.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    /**
     * Lifecycle state filter.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return Lifecycle state filter.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetLogAnalyticsObjectCollectionRulesArgs() {}

    private GetLogAnalyticsObjectCollectionRulesArgs(GetLogAnalyticsObjectCollectionRulesArgs $) {
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.name = $.name;
        this.namespace = $.namespace;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogAnalyticsObjectCollectionRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogAnalyticsObjectCollectionRulesArgs $;

        public Builder() {
            $ = new GetLogAnalyticsObjectCollectionRulesArgs();
        }

        public Builder(GetLogAnalyticsObjectCollectionRulesArgs defaults) {
            $ = new GetLogAnalyticsObjectCollectionRulesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder filters(@Nullable List<GetLogAnalyticsObjectCollectionRulesFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetLogAnalyticsObjectCollectionRulesFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name A filter to return rules only matching with this name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param state Lifecycle state filter.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetLogAnalyticsObjectCollectionRulesArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
