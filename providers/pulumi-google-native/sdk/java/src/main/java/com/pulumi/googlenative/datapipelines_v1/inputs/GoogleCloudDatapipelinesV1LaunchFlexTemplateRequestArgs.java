// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datapipelines_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.datapipelines_v1.inputs.GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A request to launch a Dataflow job from a Flex Template.
 * 
 */
public final class GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs Empty = new GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs();

    /**
     * Parameter to launch a job from a Flex Template.
     * 
     */
    @Import(name="launchParameter", required=true)
    private Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> launchParameter;

    /**
     * @return Parameter to launch a job from a Flex Template.
     * 
     */
    public Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> launchParameter() {
        return this.launchParameter;
    }

    /**
     * The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
     * 
     */
    @Import(name="location", required=true)
    private Output<String> location;

    /**
     * @return The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
     * 
     */
    public Output<String> location() {
        return this.location;
    }

    /**
     * The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    @Import(name="project", required=true)
    private Output<String> project;

    /**
     * @return The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    public Output<String> project() {
        return this.project;
    }

    /**
     * If true, the request is validated but not actually executed. Defaults to false.
     * 
     */
    @Import(name="validateOnly")
    private @Nullable Output<Boolean> validateOnly;

    /**
     * @return If true, the request is validated but not actually executed. Defaults to false.
     * 
     */
    public Optional<Output<Boolean>> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    private GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs() {}

    private GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs $) {
        this.launchParameter = $.launchParameter;
        this.location = $.location;
        this.project = $.project;
        this.validateOnly = $.validateOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs $;

        public Builder() {
            $ = new GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs();
        }

        public Builder(GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs defaults) {
            $ = new GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param launchParameter Parameter to launch a job from a Flex Template.
         * 
         * @return builder
         * 
         */
        public Builder launchParameter(Output<GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs> launchParameter) {
            $.launchParameter = launchParameter;
            return this;
        }

        /**
         * @param launchParameter Parameter to launch a job from a Flex Template.
         * 
         * @return builder
         * 
         */
        public Builder launchParameter(GoogleCloudDatapipelinesV1LaunchFlexTemplateParameterArgs launchParameter) {
            return launchParameter(Output.of(launchParameter));
        }

        /**
         * @param location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
         * 
         * @return builder
         * 
         */
        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) to which to direct the request. For example, `us-central1`, `us-west1`.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the Cloud Platform project that the job belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the Cloud Platform project that the job belongs to.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param validateOnly If true, the request is validated but not actually executed. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(@Nullable Output<Boolean> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        /**
         * @param validateOnly If true, the request is validated but not actually executed. Defaults to false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(Boolean validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        public GoogleCloudDatapipelinesV1LaunchFlexTemplateRequestArgs build() {
            $.launchParameter = Objects.requireNonNull($.launchParameter, "expected parameter 'launchParameter' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.project = Objects.requireNonNull($.project, "expected parameter 'project' to be non-null");
            return $;
        }
    }

}
