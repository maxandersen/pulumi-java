// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.documentai_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetProcessorResult {
    /**
     * The time the processor was created.
     * 
     */
    private final String createTime;
    /**
     * The default processor version.
     * 
     */
    private final String defaultProcessorVersion;
    /**
     * The display name of the processor.
     * 
     */
    private final String displayName;
    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
     */
    private final String kmsKeyName;
    /**
     * Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
     */
    private final String name;
    /**
     * Immutable. The http endpoint that can be called to invoke processing.
     * 
     */
    private final String processEndpoint;
    /**
     * The state of the processor.
     * 
     */
    private final String state;
    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetProcessorResult(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("defaultProcessorVersion") String defaultProcessorVersion,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("processEndpoint") String processEndpoint,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("type") String type) {
        this.createTime = createTime;
        this.defaultProcessorVersion = defaultProcessorVersion;
        this.displayName = displayName;
        this.kmsKeyName = kmsKeyName;
        this.name = name;
        this.processEndpoint = processEndpoint;
        this.state = state;
        this.type = type;
    }

    /**
     * The time the processor was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The default processor version.
     * 
    */
    public String defaultProcessorVersion() {
        return this.defaultProcessorVersion;
    }
    /**
     * The display name of the processor.
     * 
    */
    public String displayName() {
        return this.displayName;
    }
    /**
     * The KMS key used for encryption/decryption in CMEK scenarios. See https://cloud.google.com/security-key-management.
     * 
    */
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * Immutable. The resource name of the processor. Format: `projects/{project}/locations/{location}/processors/{processor}`
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Immutable. The http endpoint that can be called to invoke processing.
     * 
    */
    public String processEndpoint() {
        return this.processEndpoint;
    }
    /**
     * The state of the processor.
     * 
    */
    public String state() {
        return this.state;
    }
    /**
     * The processor type, e.g., INVOICE_PARSING, W2_PARSING, etc.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProcessorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String defaultProcessorVersion;
        private String displayName;
        private String kmsKeyName;
        private String name;
        private String processEndpoint;
        private String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProcessorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.defaultProcessorVersion = defaults.defaultProcessorVersion;
    	      this.displayName = defaults.displayName;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.name = defaults.name;
    	      this.processEndpoint = defaults.processEndpoint;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder defaultProcessorVersion(String defaultProcessorVersion) {
            this.defaultProcessorVersion = Objects.requireNonNull(defaultProcessorVersion);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder processEndpoint(String processEndpoint) {
            this.processEndpoint = Objects.requireNonNull(processEndpoint);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetProcessorResult build() {
            return new GetProcessorResult(createTime, defaultProcessorVersion, displayName, kmsKeyName, name, processEndpoint, state, type);
        }
    }
}
