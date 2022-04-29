// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class ListWebAppFunctionSecretsArgs extends InvokeArgs {

    public static final ListWebAppFunctionSecretsArgs Empty = new ListWebAppFunctionSecretsArgs();

    /**
     * Function name.
     * 
     */
    @Import(name="functionName", required=true)
    private String functionName;

    /**
     * @return Function name.
     * 
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Site name.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Site name.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private ListWebAppFunctionSecretsArgs() {}

    private ListWebAppFunctionSecretsArgs(ListWebAppFunctionSecretsArgs $) {
        this.functionName = $.functionName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWebAppFunctionSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWebAppFunctionSecretsArgs $;

        public Builder() {
            $ = new ListWebAppFunctionSecretsArgs();
        }

        public Builder(ListWebAppFunctionSecretsArgs defaults) {
            $ = new ListWebAppFunctionSecretsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionName Function name.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param name Site name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public ListWebAppFunctionSecretsArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
