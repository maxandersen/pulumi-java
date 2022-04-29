// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetVideoAnalyzerArgs extends InvokeArgs {

    public static final GetVideoAnalyzerArgs Empty = new GetVideoAnalyzerArgs();

    /**
     * The Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The Video Analyzer account name.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetVideoAnalyzerArgs() {}

    private GetVideoAnalyzerArgs(GetVideoAnalyzerArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVideoAnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVideoAnalyzerArgs $;

        public Builder() {
            $ = new GetVideoAnalyzerArgs();
        }

        public Builder(GetVideoAnalyzerArgs defaults) {
            $ = new GetVideoAnalyzerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Video Analyzer account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetVideoAnalyzerArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
