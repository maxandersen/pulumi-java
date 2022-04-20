// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.outputs;

import com.pulumi.azurenative.compute.outputs.InstanceViewStatusResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BootDiagnosticsInstanceViewResponse {
    /**
     * The console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
     */
    private final String consoleScreenshotBlobUri;
    /**
     * The serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
     */
    private final String serialConsoleLogBlobUri;
    /**
     * The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will be set only if there are errors encountered in enabling boot diagnostics.
     * 
     */
    private final InstanceViewStatusResponse status;

    @CustomType.Constructor
    private BootDiagnosticsInstanceViewResponse(
        @CustomType.Parameter("consoleScreenshotBlobUri") String consoleScreenshotBlobUri,
        @CustomType.Parameter("serialConsoleLogBlobUri") String serialConsoleLogBlobUri,
        @CustomType.Parameter("status") InstanceViewStatusResponse status) {
        this.consoleScreenshotBlobUri = consoleScreenshotBlobUri;
        this.serialConsoleLogBlobUri = serialConsoleLogBlobUri;
        this.status = status;
    }

    /**
     * The console screenshot blob URI. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
    */
    public String consoleScreenshotBlobUri() {
        return this.consoleScreenshotBlobUri;
    }
    /**
     * The serial console log blob Uri. &lt;br&gt;&lt;br&gt;NOTE: This will **not** be set if boot diagnostics is currently enabled with managed storage.
     * 
    */
    public String serialConsoleLogBlobUri() {
        return this.serialConsoleLogBlobUri;
    }
    /**
     * The boot diagnostics status information for the VM. &lt;br&gt;&lt;br&gt; NOTE: It will be set only if there are errors encountered in enabling boot diagnostics.
     * 
    */
    public InstanceViewStatusResponse status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BootDiagnosticsInstanceViewResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String consoleScreenshotBlobUri;
        private String serialConsoleLogBlobUri;
        private InstanceViewStatusResponse status;

        public Builder() {
    	      // Empty
        }

        public Builder(BootDiagnosticsInstanceViewResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.consoleScreenshotBlobUri = defaults.consoleScreenshotBlobUri;
    	      this.serialConsoleLogBlobUri = defaults.serialConsoleLogBlobUri;
    	      this.status = defaults.status;
        }

        public Builder consoleScreenshotBlobUri(String consoleScreenshotBlobUri) {
            this.consoleScreenshotBlobUri = Objects.requireNonNull(consoleScreenshotBlobUri);
            return this;
        }
        public Builder serialConsoleLogBlobUri(String serialConsoleLogBlobUri) {
            this.serialConsoleLogBlobUri = Objects.requireNonNull(serialConsoleLogBlobUri);
            return this;
        }
        public Builder status(InstanceViewStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public BootDiagnosticsInstanceViewResponse build() {
            return new BootDiagnosticsInstanceViewResponse(consoleScreenshotBlobUri, serialConsoleLogBlobUri, status);
        }
    }
}
