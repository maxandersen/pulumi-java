// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FlexibleAppVersionHandlerScriptGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final FlexibleAppVersionHandlerScriptGetArgs Empty = new FlexibleAppVersionHandlerScriptGetArgs();

    /**
     * Path to the script from the application root directory.
     * 
     */
    @Import(name="scriptPath", required=true)
    private Output<String> scriptPath;

    public Output<String> scriptPath() {
        return this.scriptPath;
    }

    private FlexibleAppVersionHandlerScriptGetArgs() {}

    private FlexibleAppVersionHandlerScriptGetArgs(FlexibleAppVersionHandlerScriptGetArgs $) {
        this.scriptPath = $.scriptPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FlexibleAppVersionHandlerScriptGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FlexibleAppVersionHandlerScriptGetArgs $;

        public Builder() {
            $ = new FlexibleAppVersionHandlerScriptGetArgs();
        }

        public Builder(FlexibleAppVersionHandlerScriptGetArgs defaults) {
            $ = new FlexibleAppVersionHandlerScriptGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder scriptPath(Output<String> scriptPath) {
            $.scriptPath = scriptPath;
            return this;
        }

        public Builder scriptPath(String scriptPath) {
            return scriptPath(Output.of(scriptPath));
        }

        public FlexibleAppVersionHandlerScriptGetArgs build() {
            $.scriptPath = Objects.requireNonNull($.scriptPath, "expected parameter 'scriptPath' to be non-null");
            return $;
        }
    }

}
