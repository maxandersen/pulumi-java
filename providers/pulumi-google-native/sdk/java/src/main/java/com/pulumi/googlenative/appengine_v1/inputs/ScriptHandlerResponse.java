// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Executes a script to handle the request that matches the URL pattern.
 * 
 */
public final class ScriptHandlerResponse extends com.pulumi.resources.InvokeArgs {

    public static final ScriptHandlerResponse Empty = new ScriptHandlerResponse();

    /**
     * Path to the script from the application root directory.
     * 
     */
    @Import(name="scriptPath", required=true)
      private final String scriptPath;

    public String scriptPath() {
        return this.scriptPath;
    }

    public ScriptHandlerResponse(String scriptPath) {
        this.scriptPath = Objects.requireNonNull(scriptPath, "expected parameter 'scriptPath' to be non-null");
    }

    private ScriptHandlerResponse() {
        this.scriptPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scriptPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scriptPath = defaults.scriptPath;
        }

        public Builder scriptPath(String scriptPath) {
            this.scriptPath = Objects.requireNonNull(scriptPath);
            return this;
        }        public ScriptHandlerResponse build() {
            return new ScriptHandlerResponse(scriptPath);
        }
    }
}
