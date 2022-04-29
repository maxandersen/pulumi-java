// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.inputs.ApplicationLogsConfigArgs;
import com.pulumi.azurenative.web.inputs.EnabledConfigArgs;
import com.pulumi.azurenative.web.inputs.HttpLogsConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppDiagnosticLogsConfigurationArgs extends ResourceArgs {

    public static final WebAppDiagnosticLogsConfigurationArgs Empty = new WebAppDiagnosticLogsConfigurationArgs();

    /**
     * Application logs configuration.
     * 
     */
    @Import(name="applicationLogs")
    private @Nullable Output<ApplicationLogsConfigArgs> applicationLogs;

    /**
     * @return Application logs configuration.
     * 
     */
    public Optional<Output<ApplicationLogsConfigArgs>> applicationLogs() {
        return Optional.ofNullable(this.applicationLogs);
    }

    /**
     * Detailed error messages configuration.
     * 
     */
    @Import(name="detailedErrorMessages")
    private @Nullable Output<EnabledConfigArgs> detailedErrorMessages;

    /**
     * @return Detailed error messages configuration.
     * 
     */
    public Optional<Output<EnabledConfigArgs>> detailedErrorMessages() {
        return Optional.ofNullable(this.detailedErrorMessages);
    }

    /**
     * Failed requests tracing configuration.
     * 
     */
    @Import(name="failedRequestsTracing")
    private @Nullable Output<EnabledConfigArgs> failedRequestsTracing;

    /**
     * @return Failed requests tracing configuration.
     * 
     */
    public Optional<Output<EnabledConfigArgs>> failedRequestsTracing() {
        return Optional.ofNullable(this.failedRequestsTracing);
    }

    /**
     * HTTP logs configuration.
     * 
     */
    @Import(name="httpLogs")
    private @Nullable Output<HttpLogsConfigArgs> httpLogs;

    /**
     * @return HTTP logs configuration.
     * 
     */
    public Optional<Output<HttpLogsConfigArgs>> httpLogs() {
        return Optional.ofNullable(this.httpLogs);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private WebAppDiagnosticLogsConfigurationArgs() {}

    private WebAppDiagnosticLogsConfigurationArgs(WebAppDiagnosticLogsConfigurationArgs $) {
        this.applicationLogs = $.applicationLogs;
        this.detailedErrorMessages = $.detailedErrorMessages;
        this.failedRequestsTracing = $.failedRequestsTracing;
        this.httpLogs = $.httpLogs;
        this.kind = $.kind;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppDiagnosticLogsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppDiagnosticLogsConfigurationArgs $;

        public Builder() {
            $ = new WebAppDiagnosticLogsConfigurationArgs();
        }

        public Builder(WebAppDiagnosticLogsConfigurationArgs defaults) {
            $ = new WebAppDiagnosticLogsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationLogs Application logs configuration.
         * 
         * @return builder
         * 
         */
        public Builder applicationLogs(@Nullable Output<ApplicationLogsConfigArgs> applicationLogs) {
            $.applicationLogs = applicationLogs;
            return this;
        }

        /**
         * @param applicationLogs Application logs configuration.
         * 
         * @return builder
         * 
         */
        public Builder applicationLogs(ApplicationLogsConfigArgs applicationLogs) {
            return applicationLogs(Output.of(applicationLogs));
        }

        /**
         * @param detailedErrorMessages Detailed error messages configuration.
         * 
         * @return builder
         * 
         */
        public Builder detailedErrorMessages(@Nullable Output<EnabledConfigArgs> detailedErrorMessages) {
            $.detailedErrorMessages = detailedErrorMessages;
            return this;
        }

        /**
         * @param detailedErrorMessages Detailed error messages configuration.
         * 
         * @return builder
         * 
         */
        public Builder detailedErrorMessages(EnabledConfigArgs detailedErrorMessages) {
            return detailedErrorMessages(Output.of(detailedErrorMessages));
        }

        /**
         * @param failedRequestsTracing Failed requests tracing configuration.
         * 
         * @return builder
         * 
         */
        public Builder failedRequestsTracing(@Nullable Output<EnabledConfigArgs> failedRequestsTracing) {
            $.failedRequestsTracing = failedRequestsTracing;
            return this;
        }

        /**
         * @param failedRequestsTracing Failed requests tracing configuration.
         * 
         * @return builder
         * 
         */
        public Builder failedRequestsTracing(EnabledConfigArgs failedRequestsTracing) {
            return failedRequestsTracing(Output.of(failedRequestsTracing));
        }

        /**
         * @param httpLogs HTTP logs configuration.
         * 
         * @return builder
         * 
         */
        public Builder httpLogs(@Nullable Output<HttpLogsConfigArgs> httpLogs) {
            $.httpLogs = httpLogs;
            return this;
        }

        /**
         * @param httpLogs HTTP logs configuration.
         * 
         * @return builder
         * 
         */
        public Builder httpLogs(HttpLogsConfigArgs httpLogs) {
            return httpLogs(Output.of(httpLogs));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public WebAppDiagnosticLogsConfigurationArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
