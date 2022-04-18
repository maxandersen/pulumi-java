// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodeInitializationActionResponse {
    /**
     * Cloud Storage URI of executable file.
     * 
     */
    private final String executableFile;
    /**
     * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
     */
    private final String executionTimeout;

    @CustomType.Constructor
    private NodeInitializationActionResponse(
        @CustomType.Parameter("executableFile") String executableFile,
        @CustomType.Parameter("executionTimeout") String executionTimeout) {
        this.executableFile = executableFile;
        this.executionTimeout = executionTimeout;
    }

    /**
     * Cloud Storage URI of executable file.
     * 
    */
    public String executableFile() {
        return this.executableFile;
    }
    /**
     * Optional. Amount of time executable has to complete. Default is 10 minutes (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).Cluster creation fails with an explanatory error message (the name of the executable that caused the error and the exceeded timeout period) if the executable is not completed at end of the timeout period.
     * 
    */
    public String executionTimeout() {
        return this.executionTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeInitializationActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String executableFile;
        private String executionTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeInitializationActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executableFile = defaults.executableFile;
    	      this.executionTimeout = defaults.executionTimeout;
        }

        public Builder executableFile(String executableFile) {
            this.executableFile = Objects.requireNonNull(executableFile);
            return this;
        }
        public Builder executionTimeout(String executionTimeout) {
            this.executionTimeout = Objects.requireNonNull(executionTimeout);
            return this;
        }        public NodeInitializationActionResponse build() {
            return new NodeInitializationActionResponse(executableFile, executionTimeout);
        }
    }
}
