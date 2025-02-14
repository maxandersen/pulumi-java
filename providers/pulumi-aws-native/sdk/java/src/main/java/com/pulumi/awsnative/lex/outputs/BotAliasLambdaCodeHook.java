// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BotAliasLambdaCodeHook {
    /**
     * @return The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * 
     */
    private final String codeHookInterfaceVersion;
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    private final String lambdaArn;

    @CustomType.Constructor
    private BotAliasLambdaCodeHook(
        @CustomType.Parameter("codeHookInterfaceVersion") String codeHookInterfaceVersion,
        @CustomType.Parameter("lambdaArn") String lambdaArn) {
        this.codeHookInterfaceVersion = codeHookInterfaceVersion;
        this.lambdaArn = lambdaArn;
    }

    /**
     * @return The version of the request-response that you want Amazon Lex to use to invoke your Lambda function.
     * 
     */
    public String codeHookInterfaceVersion() {
        return this.codeHookInterfaceVersion;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Lambda function.
     * 
     */
    public String lambdaArn() {
        return this.lambdaArn;
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
