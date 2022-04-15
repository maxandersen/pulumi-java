// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.azurenative.avs.outputs.PSCredentialExecutionParameterResponse;
import io.pulumi.azurenative.avs.outputs.ScriptSecureStringExecutionParameterResponse;
import io.pulumi.azurenative.avs.outputs.ScriptStringExecutionParameterResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetScriptExecutionLogsResult {
    /**
     * Standard error output stream from the powershell execution
     * 
     */
    private final List<String> errors;
    /**
     * Error message if the script was able to run, but if the script itself had errors or powershell threw an exception
     * 
     */
    private final @Nullable String failureReason;
    /**
     * Time the script execution was finished
     * 
     */
    private final String finishedAt;
    /**
     * Parameters that will be hidden/not visible to ARM, such as passwords and credentials
     * 
     */
    private final @Nullable List<Object> hiddenParameters;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Standard information out stream from the powershell execution
     * 
     */
    private final List<String> information;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * User-defined dictionary.
     * 
     */
    private final @Nullable Map<String,Object> namedOutputs;
    /**
     * Standard output stream from the powershell execution
     * 
     */
    private final @Nullable List<String> output;
    /**
     * Parameters the script will accept
     * 
     */
    private final @Nullable List<Object> parameters;
    /**
     * The state of the script execution resource
     * 
     */
    private final String provisioningState;
    /**
     * Time to live for the resource. If not provided, will be available for 60 days
     * 
     */
    private final @Nullable String retention;
    /**
     * A reference to the script cmdlet resource if user is running a AVS script
     * 
     */
    private final @Nullable String scriptCmdletId;
    /**
     * Time the script execution was started
     * 
     */
    private final String startedAt;
    /**
     * Time the script execution was submitted
     * 
     */
    private final String submittedAt;
    /**
     * Time limit for execution
     * 
     */
    private final String timeout;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Standard warning out stream from the powershell execution
     * 
     */
    private final List<String> warnings;

    @CustomType.Constructor
    private GetScriptExecutionLogsResult(
        @CustomType.Parameter("errors") List<String> errors,
        @CustomType.Parameter("failureReason") @Nullable String failureReason,
        @CustomType.Parameter("finishedAt") String finishedAt,
        @CustomType.Parameter("hiddenParameters") @Nullable List<Object> hiddenParameters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("information") List<String> information,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namedOutputs") @Nullable Map<String,Object> namedOutputs,
        @CustomType.Parameter("output") @Nullable List<String> output,
        @CustomType.Parameter("parameters") @Nullable List<Object> parameters,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("retention") @Nullable String retention,
        @CustomType.Parameter("scriptCmdletId") @Nullable String scriptCmdletId,
        @CustomType.Parameter("startedAt") String startedAt,
        @CustomType.Parameter("submittedAt") String submittedAt,
        @CustomType.Parameter("timeout") String timeout,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("warnings") List<String> warnings) {
        this.errors = errors;
        this.failureReason = failureReason;
        this.finishedAt = finishedAt;
        this.hiddenParameters = hiddenParameters;
        this.id = id;
        this.information = information;
        this.name = name;
        this.namedOutputs = namedOutputs;
        this.output = output;
        this.parameters = parameters;
        this.provisioningState = provisioningState;
        this.retention = retention;
        this.scriptCmdletId = scriptCmdletId;
        this.startedAt = startedAt;
        this.submittedAt = submittedAt;
        this.timeout = timeout;
        this.type = type;
        this.warnings = warnings;
    }

    /**
     * Standard error output stream from the powershell execution
     * 
    */
    public List<String> errors() {
        return this.errors;
    }
    /**
     * Error message if the script was able to run, but if the script itself had errors or powershell threw an exception
     * 
    */
    public Optional<String> failureReason() {
        return Optional.ofNullable(this.failureReason);
    }
    /**
     * Time the script execution was finished
     * 
    */
    public String finishedAt() {
        return this.finishedAt;
    }
    /**
     * Parameters that will be hidden/not visible to ARM, such as passwords and credentials
     * 
    */
    public List<Object> hiddenParameters() {
        return this.hiddenParameters == null ? List.of() : this.hiddenParameters;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Standard information out stream from the powershell execution
     * 
    */
    public List<String> information() {
        return this.information;
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * User-defined dictionary.
     * 
    */
    public Map<String,Object> namedOutputs() {
        return this.namedOutputs == null ? Map.of() : this.namedOutputs;
    }
    /**
     * Standard output stream from the powershell execution
     * 
    */
    public List<String> output() {
        return this.output == null ? List.of() : this.output;
    }
    /**
     * Parameters the script will accept
     * 
    */
    public List<Object> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    /**
     * The state of the script execution resource
     * 
    */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * Time to live for the resource. If not provided, will be available for 60 days
     * 
    */
    public Optional<String> retention() {
        return Optional.ofNullable(this.retention);
    }
    /**
     * A reference to the script cmdlet resource if user is running a AVS script
     * 
    */
    public Optional<String> scriptCmdletId() {
        return Optional.ofNullable(this.scriptCmdletId);
    }
    /**
     * Time the script execution was started
     * 
    */
    public String startedAt() {
        return this.startedAt;
    }
    /**
     * Time the script execution was submitted
     * 
    */
    public String submittedAt() {
        return this.submittedAt;
    }
    /**
     * Time limit for execution
     * 
    */
    public String timeout() {
        return this.timeout;
    }
    /**
     * Resource type.
     * 
    */
    public String type() {
        return this.type;
    }
    /**
     * Standard warning out stream from the powershell execution
     * 
    */
    public List<String> warnings() {
        return this.warnings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScriptExecutionLogsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> errors;
        private @Nullable String failureReason;
        private String finishedAt;
        private @Nullable List<Object> hiddenParameters;
        private String id;
        private List<String> information;
        private String name;
        private @Nullable Map<String,Object> namedOutputs;
        private @Nullable List<String> output;
        private @Nullable List<Object> parameters;
        private String provisioningState;
        private @Nullable String retention;
        private @Nullable String scriptCmdletId;
        private String startedAt;
        private String submittedAt;
        private String timeout;
        private String type;
        private List<String> warnings;

        public Builder() {
    	      // Empty
        }

        public Builder(GetScriptExecutionLogsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.failureReason = defaults.failureReason;
    	      this.finishedAt = defaults.finishedAt;
    	      this.hiddenParameters = defaults.hiddenParameters;
    	      this.id = defaults.id;
    	      this.information = defaults.information;
    	      this.name = defaults.name;
    	      this.namedOutputs = defaults.namedOutputs;
    	      this.output = defaults.output;
    	      this.parameters = defaults.parameters;
    	      this.provisioningState = defaults.provisioningState;
    	      this.retention = defaults.retention;
    	      this.scriptCmdletId = defaults.scriptCmdletId;
    	      this.startedAt = defaults.startedAt;
    	      this.submittedAt = defaults.submittedAt;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.warnings = defaults.warnings;
        }

        public Builder errors(List<String> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }
        public Builder errors(String... errors) {
            return errors(List.of(errors));
        }
        public Builder failureReason(@Nullable String failureReason) {
            this.failureReason = failureReason;
            return this;
        }
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = Objects.requireNonNull(finishedAt);
            return this;
        }
        public Builder hiddenParameters(@Nullable List<Object> hiddenParameters) {
            this.hiddenParameters = hiddenParameters;
            return this;
        }
        public Builder hiddenParameters(Object... hiddenParameters) {
            return hiddenParameters(List.of(hiddenParameters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder information(List<String> information) {
            this.information = Objects.requireNonNull(information);
            return this;
        }
        public Builder information(String... information) {
            return information(List.of(information));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namedOutputs(@Nullable Map<String,Object> namedOutputs) {
            this.namedOutputs = namedOutputs;
            return this;
        }
        public Builder output(@Nullable List<String> output) {
            this.output = output;
            return this;
        }
        public Builder output(String... output) {
            return output(List.of(output));
        }
        public Builder parameters(@Nullable List<Object> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(Object... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder retention(@Nullable String retention) {
            this.retention = retention;
            return this;
        }
        public Builder scriptCmdletId(@Nullable String scriptCmdletId) {
            this.scriptCmdletId = scriptCmdletId;
            return this;
        }
        public Builder startedAt(String startedAt) {
            this.startedAt = Objects.requireNonNull(startedAt);
            return this;
        }
        public Builder submittedAt(String submittedAt) {
            this.submittedAt = Objects.requireNonNull(submittedAt);
            return this;
        }
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder warnings(List<String> warnings) {
            this.warnings = Objects.requireNonNull(warnings);
            return this;
        }
        public Builder warnings(String... warnings) {
            return warnings(List.of(warnings));
        }        public GetScriptExecutionLogsResult build() {
            return new GetScriptExecutionLogsResult(errors, failureReason, finishedAt, hiddenParameters, id, information, name, namedOutputs, output, parameters, provisioningState, retention, scriptCmdletId, startedAt, submittedAt, timeout, type, warnings);
        }
    }
}
