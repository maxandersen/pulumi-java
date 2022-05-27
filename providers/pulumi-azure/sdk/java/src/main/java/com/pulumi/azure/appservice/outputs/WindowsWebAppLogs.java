// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppLogsApplicationLogs;
import com.pulumi.azure.appservice.outputs.WindowsWebAppLogsHttpLogs;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppLogs {
    /**
     * @return A `application_logs` block as defined above.
     * 
     */
    private final @Nullable WindowsWebAppLogsApplicationLogs applicationLogs;
    /**
     * @return Should detailed error messages be enabled.
     * 
     */
    private final @Nullable Boolean detailedErrorMessages;
    /**
     * @return Should tracing be enabled for failed requests.
     * 
     */
    private final @Nullable Boolean failedRequestTracing;
    /**
     * @return A `http_logs` block as defined above.
     * 
     */
    private final @Nullable WindowsWebAppLogsHttpLogs httpLogs;

    @CustomType.Constructor
    private WindowsWebAppLogs(
        @CustomType.Parameter("applicationLogs") @Nullable WindowsWebAppLogsApplicationLogs applicationLogs,
        @CustomType.Parameter("detailedErrorMessages") @Nullable Boolean detailedErrorMessages,
        @CustomType.Parameter("failedRequestTracing") @Nullable Boolean failedRequestTracing,
        @CustomType.Parameter("httpLogs") @Nullable WindowsWebAppLogsHttpLogs httpLogs) {
        this.applicationLogs = applicationLogs;
        this.detailedErrorMessages = detailedErrorMessages;
        this.failedRequestTracing = failedRequestTracing;
        this.httpLogs = httpLogs;
    }

    /**
     * @return A `application_logs` block as defined above.
     * 
     */
    public Optional<WindowsWebAppLogsApplicationLogs> applicationLogs() {
        return Optional.ofNullable(this.applicationLogs);
    }
    /**
     * @return Should detailed error messages be enabled.
     * 
     */
    public Optional<Boolean> detailedErrorMessages() {
        return Optional.ofNullable(this.detailedErrorMessages);
    }
    /**
     * @return Should tracing be enabled for failed requests.
     * 
     */
    public Optional<Boolean> failedRequestTracing() {
        return Optional.ofNullable(this.failedRequestTracing);
    }
    /**
     * @return A `http_logs` block as defined above.
     * 
     */
    public Optional<WindowsWebAppLogsHttpLogs> httpLogs() {
        return Optional.ofNullable(this.httpLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WindowsWebAppLogsApplicationLogs applicationLogs;
        private @Nullable Boolean detailedErrorMessages;
        private @Nullable Boolean failedRequestTracing;
        private @Nullable WindowsWebAppLogsHttpLogs httpLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationLogs = defaults.applicationLogs;
    	      this.detailedErrorMessages = defaults.detailedErrorMessages;
    	      this.failedRequestTracing = defaults.failedRequestTracing;
    	      this.httpLogs = defaults.httpLogs;
        }

        public Builder applicationLogs(@Nullable WindowsWebAppLogsApplicationLogs applicationLogs) {
            this.applicationLogs = applicationLogs;
            return this;
        }
        public Builder detailedErrorMessages(@Nullable Boolean detailedErrorMessages) {
            this.detailedErrorMessages = detailedErrorMessages;
            return this;
        }
        public Builder failedRequestTracing(@Nullable Boolean failedRequestTracing) {
            this.failedRequestTracing = failedRequestTracing;
            return this;
        }
        public Builder httpLogs(@Nullable WindowsWebAppLogsHttpLogs httpLogs) {
            this.httpLogs = httpLogs;
            return this;
        }        public WindowsWebAppLogs build() {
            return new WindowsWebAppLogs(applicationLogs, detailedErrorMessages, failedRequestTracing, httpLogs);
        }
    }
}
