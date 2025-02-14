// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DatabaseMigration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DatabaseMigration.inputs.GetMigrationsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMigrationsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMigrationsArgs Empty = new GetMigrationsArgs();

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

    /**
     * A filter to return only resources that match the entire display name given.
     * 
     */
    @Import(name="displayName")
    private @Nullable String displayName;

    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetMigrationsFilter> filters;

    public Optional<List<GetMigrationsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The lifecycle detailed status of the Migration.
     * 
     */
    @Import(name="lifecycleDetails")
    private @Nullable String lifecycleDetails;

    /**
     * @return The lifecycle detailed status of the Migration.
     * 
     */
    public Optional<String> lifecycleDetails() {
        return Optional.ofNullable(this.lifecycleDetails);
    }

    /**
     * The lifecycle state of the Migration.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return The lifecycle state of the Migration.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetMigrationsArgs() {}

    private GetMigrationsArgs(GetMigrationsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.lifecycleDetails = $.lifecycleDetails;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMigrationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMigrationsArgs $;

        public Builder() {
            $ = new GetMigrationsArgs();
        }

        public Builder(GetMigrationsArgs defaults) {
            $ = new GetMigrationsArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param displayName A filter to return only resources that match the entire display name given.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetMigrationsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetMigrationsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param lifecycleDetails The lifecycle detailed status of the Migration.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleDetails(@Nullable String lifecycleDetails) {
            $.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /**
         * @param state The lifecycle state of the Migration.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetMigrationsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
