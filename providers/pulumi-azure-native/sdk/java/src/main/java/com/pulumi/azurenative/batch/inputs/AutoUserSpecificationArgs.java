// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.AutoUserScope;
import com.pulumi.azurenative.batch.enums.ElevationLevel;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutoUserSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoUserSpecificationArgs Empty = new AutoUserSpecificationArgs();

    /**
     * The default value is nonAdmin.
     * 
     */
    @Import(name="elevationLevel")
    private @Nullable Output<ElevationLevel> elevationLevel;

    /**
     * @return The default value is nonAdmin.
     * 
     */
    public Optional<Output<ElevationLevel>> elevationLevel() {
        return Optional.ofNullable(this.elevationLevel);
    }

    /**
     * The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    @Import(name="scope")
    private @Nullable Output<AutoUserScope> scope;

    /**
     * @return The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
     * 
     */
    public Optional<Output<AutoUserScope>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private AutoUserSpecificationArgs() {}

    private AutoUserSpecificationArgs(AutoUserSpecificationArgs $) {
        this.elevationLevel = $.elevationLevel;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoUserSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoUserSpecificationArgs $;

        public Builder() {
            $ = new AutoUserSpecificationArgs();
        }

        public Builder(AutoUserSpecificationArgs defaults) {
            $ = new AutoUserSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param elevationLevel The default value is nonAdmin.
         * 
         * @return builder
         * 
         */
        public Builder elevationLevel(@Nullable Output<ElevationLevel> elevationLevel) {
            $.elevationLevel = elevationLevel;
            return this;
        }

        /**
         * @param elevationLevel The default value is nonAdmin.
         * 
         * @return builder
         * 
         */
        public Builder elevationLevel(ElevationLevel elevationLevel) {
            return elevationLevel(Output.of(elevationLevel));
        }

        /**
         * @param scope The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<AutoUserScope> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The default value is Pool. If the pool is running Windows a value of Task should be specified if stricter isolation between tasks is required. For example, if the task mutates the registry in a way which could impact other tasks, or if certificates have been specified on the pool which should not be accessible by normal tasks but should be accessible by start tasks.
         * 
         * @return builder
         * 
         */
        public Builder scope(AutoUserScope scope) {
            return scope(Output.of(scope));
        }

        public AutoUserSpecificationArgs build() {
            return $;
        }
    }

}
