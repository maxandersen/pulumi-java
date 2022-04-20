// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration for a scoring code asset.
 * 
 */
public final class CodeConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CodeConfigurationArgs Empty = new CodeConfigurationArgs();

    /**
     * ARM resource ID of the code asset.
     * 
     */
    @Import(name="codeId")
      private final @Nullable Output<String> codeId;

    public Output<String> codeId() {
        return this.codeId == null ? Codegen.empty() : this.codeId;
    }

    /**
     * The script to execute on startup. eg. &#34;score.py&#34;
     * 
     */
    @Import(name="scoringScript", required=true)
      private final Output<String> scoringScript;

    public Output<String> scoringScript() {
        return this.scoringScript;
    }

    public CodeConfigurationArgs(
        @Nullable Output<String> codeId,
        Output<String> scoringScript) {
        this.codeId = codeId;
        this.scoringScript = Objects.requireNonNull(scoringScript, "expected parameter 'scoringScript' to be non-null");
    }

    private CodeConfigurationArgs() {
        this.codeId = Codegen.empty();
        this.scoringScript = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> codeId;
        private Output<String> scoringScript;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeId = defaults.codeId;
    	      this.scoringScript = defaults.scoringScript;
        }

        public Builder codeId(@Nullable Output<String> codeId) {
            this.codeId = codeId;
            return this;
        }
        public Builder codeId(@Nullable String codeId) {
            this.codeId = Codegen.ofNullable(codeId);
            return this;
        }
        public Builder scoringScript(Output<String> scoringScript) {
            this.scoringScript = Objects.requireNonNull(scoringScript);
            return this;
        }
        public Builder scoringScript(String scoringScript) {
            this.scoringScript = Output.of(Objects.requireNonNull(scoringScript));
            return this;
        }        public CodeConfigurationArgs build() {
            return new CodeConfigurationArgs(codeId, scoringScript);
        }
    }
}
