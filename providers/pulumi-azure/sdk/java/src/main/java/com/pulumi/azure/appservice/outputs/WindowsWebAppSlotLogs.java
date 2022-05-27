// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.outputs;

import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotLogsApplicationLogs;
import com.pulumi.azure.appservice.outputs.WindowsWebAppSlotLogsHttpLogs;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WindowsWebAppSlotLogs {
    /**
     * @return A `application_logs` block as defined above.
     * 
     */
    private final @Nullable WindowsWebAppSlotLogsApplicationLogs applicationLogs;
    /**
     * @return Should detailed error messages be enabled.
     * 
     */
    private final @Nullable Boolean detailedErrorMessages;
    /**
     * @return Should failed request tracing be enabled.
     * 
     */
    private final @Nullable Boolean failedRequestTracing;
    /**
     * @return An `http_logs` block as defined above.
     * 
     */
    private final @Nullable WindowsWebAppSlotLogsHttpLogs httpLogs;

    @CustomType.Constructor
    private WindowsWebAppSlotLogs(
        @CustomType.Parameter("applicationLogs") @Nullable WindowsWebAppSlotLogsApplicationLogs applicationLogs,
        @CustomType.Parameter("detailedErrorMessages") @Nullable Boolean detailedErrorMessages,
        @CustomType.Parameter("failedRequestTracing") @Nullable Boolean failedRequestTracing,
        @CustomType.Parameter("httpLogs") @Nullable WindowsWebAppSlotLogsHttpLogs httpLogs) {
        this.applicationLogs = applicationLogs;
        this.detailedErrorMessages = detailedErrorMessages;
        this.failedRequestTracing = failedRequestTracing;
        this.httpLogs = httpLogs;
    }

    /**
     * @return A `application_logs` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotLogsApplicationLogs> applicationLogs() {
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
     * @return Should failed request tracing be enabled.
     * 
     */
    public Optional<Boolean> failedRequestTracing() {
        return Optional.ofNullable(this.failedRequestTracing);
    }
    /**
     * @return An `http_logs` block as defined above.
     * 
     */
    public Optional<WindowsWebAppSlotLogsHttpLogs> httpLogs() {
        return Optional.ofNullable(this.httpLogs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsWebAppSlotLogs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WindowsWebAppSlotLogsApplicationLogs applicationLogs;
        private @Nullable Boolean detailedErrorMessages;
        private @Nullable Boolean failedRequestTracing;
        private @Nullable WindowsWebAppSlotLogsHttpLogs httpLogs;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsWebAppSlotLogs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationLogs = defaults.applicationLogs;
    	      this.detailedErrorMessages = defaults.detailedErrorMessages;
    	      this.failedRequestTracing = defaults.failedRequestTracing;
    	      this.httpLogs = defaults.httpLogs;
        }

        public Builder applicationLogs(@Nullable WindowsWebAppSlotLogsApplicationLogs applicationLogs) {
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
        public Builder httpLogs(@Nullable WindowsWebAppSlotLogsHttpLogs httpLogs) {
            this.httpLogs = httpLogs;
            return this;
        }        public WindowsWebAppSlotLogs build() {
            return new WindowsWebAppSlotLogs(applicationLogs, detailedErrorMessages, failedRequestTracing, httpLogs);
        }
    }
}
