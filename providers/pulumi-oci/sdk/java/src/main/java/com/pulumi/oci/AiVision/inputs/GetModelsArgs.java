// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiVision.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.AiVision.inputs.GetModelsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetModelsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetModelsArgs Empty = new GetModelsArgs();

    /**
     * The ID of the compartment in which to list resources.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable String compartmentId;

    /**
     * @return The ID of the compartment in which to list resources.
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
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
    private @Nullable List<GetModelsFilter> filters;

    public Optional<List<GetModelsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * unique Model identifier
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return unique Model identifier
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The ID of the project for which to list the objects.
     * 
     */
    @Import(name="projectId")
    private @Nullable String projectId;

    /**
     * @return The ID of the project for which to list the objects.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * A filter to return only resources their lifecycleState matches the given lifecycleState.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return A filter to return only resources their lifecycleState matches the given lifecycleState.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetModelsArgs() {}

    private GetModelsArgs(GetModelsArgs $) {
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.id = $.id;
        this.projectId = $.projectId;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetModelsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetModelsArgs $;

        public Builder() {
            $ = new GetModelsArgs();
        }

        public Builder(GetModelsArgs defaults) {
            $ = new GetModelsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId The ID of the compartment in which to list resources.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable String compartmentId) {
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

        public Builder filters(@Nullable List<GetModelsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetModelsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id unique Model identifier
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param projectId The ID of the project for which to list the objects.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable String projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param state A filter to return only resources their lifecycleState matches the given lifecycleState.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetModelsArgs build() {
            return $;
        }
    }

}
