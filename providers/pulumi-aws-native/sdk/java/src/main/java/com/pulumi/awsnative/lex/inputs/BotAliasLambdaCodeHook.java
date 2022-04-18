// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information about code hooks that Amazon Lex calls during a conversation.
 * 
 */
public final class BotAliasLambdaCodeHook extends com.pulumi.resources.InvokeArgs {

    public static final BotAliasLambdaCodeHook Empty = new BotAliasLambdaCodeHook();

    /**
     * The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * 
     */
    @Import(name="codeHookInterfaceVersion", required=true)
      private final String codeHookInterfaceVersion;

    public String codeHookInterfaceVersion() {
        return this.codeHookInterfaceVersion;
    }

    /**
     * The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    @Import(name="lambdaArn", required=true)
      private final String lambdaArn;

    public String lambdaArn() {
        return this.lambdaArn;
    }

    public BotAliasLambdaCodeHook(
        String codeHookInterfaceVersion,
        String lambdaArn) {
        this.codeHookInterfaceVersion = Objects.requireNonNull(codeHookInterfaceVersion, "expected parameter 'codeHookInterfaceVersion' to be non-null");
        this.lambdaArn = Objects.requireNonNull(lambdaArn, "expected parameter 'lambdaArn' to be non-null");
    }

    private BotAliasLambdaCodeHook() {
        this.codeHookInterfaceVersion = null;
        this.lambdaArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotAliasLambdaCodeHook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String codeHookInterfaceVersion;
        private String lambdaArn;

        public Builder() {
    	      // Empty
        }

        public Builder(BotAliasLambdaCodeHook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.codeHookInterfaceVersion = defaults.codeHookInterfaceVersion;
    	      this.lambdaArn = defaults.lambdaArn;
        }

        public Builder codeHookInterfaceVersion(String codeHookInterfaceVersion) {
            this.codeHookInterfaceVersion = Objects.requireNonNull(codeHookInterfaceVersion);
            return this;
        }
        public Builder lambdaArn(String lambdaArn) {
            this.lambdaArn = Objects.requireNonNull(lambdaArn);
            return this;
        }        public BotAliasLambdaCodeHook build() {
            return new BotAliasLambdaCodeHook(codeHookInterfaceVersion, lambdaArn);
        }
    }
}
