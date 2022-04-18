// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.inputs.ScriptReferenceResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customized setup scripts
 * 
 */
public final class ScriptsToExecuteResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScriptsToExecuteResponse Empty = new ScriptsToExecuteResponse();

    /**
     * Script that's run only once during provision of the compute.
     * 
     */
    @Import(name="creationScript")
      private final @Nullable ScriptReferenceResponse creationScript;

    public Optional<ScriptReferenceResponse> creationScript() {
        return this.creationScript == null ? Optional.empty() : Optional.ofNullable(this.creationScript);
    }

    /**
     * Script that's run every time the machine starts.
     * 
     */
    @Import(name="startupScript")
      private final @Nullable ScriptReferenceResponse startupScript;

    public Optional<ScriptReferenceResponse> startupScript() {
        return this.startupScript == null ? Optional.empty() : Optional.ofNullable(this.startupScript);
    }

    public ScriptsToExecuteResponse(
        @Nullable ScriptReferenceResponse creationScript,
        @Nullable ScriptReferenceResponse startupScript) {
        this.creationScript = creationScript;
        this.startupScript = startupScript;
    }

    private ScriptsToExecuteResponse() {
        this.creationScript = null;
        this.startupScript = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptsToExecuteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScriptReferenceResponse creationScript;
        private @Nullable ScriptReferenceResponse startupScript;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptsToExecuteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationScript = defaults.creationScript;
    	      this.startupScript = defaults.startupScript;
        }

        public Builder creationScript(@Nullable ScriptReferenceResponse creationScript) {
            this.creationScript = creationScript;
            return this;
        }
        public Builder startupScript(@Nullable ScriptReferenceResponse startupScript) {
            this.startupScript = startupScript;
            return this;
        }        public ScriptsToExecuteResponse build() {
            return new ScriptsToExecuteResponse(creationScript, startupScript);
        }
    }
}
