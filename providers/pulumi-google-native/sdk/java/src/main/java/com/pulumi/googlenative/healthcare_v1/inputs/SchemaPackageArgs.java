// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.healthcare_v1.enums.SchemaPackageSchematizedParsingType;
import com.pulumi.googlenative.healthcare_v1.enums.SchemaPackageUnexpectedSegmentHandling;
import com.pulumi.googlenative.healthcare_v1.inputs.Hl7SchemaConfigArgs;
import com.pulumi.googlenative.healthcare_v1.inputs.Hl7TypesConfigArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A schema package contains a set of schemas and type definitions.
 * 
 */
public final class SchemaPackageArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchemaPackageArgs Empty = new SchemaPackageArgs();

    /**
     * Flag to ignore all min_occurs restrictions in the schema. This means that incoming messages can omit any group, segment, field, component, or subcomponent.
     * 
     */
    @Import(name="ignoreMinOccurs")
    private @Nullable Output<Boolean> ignoreMinOccurs;

    public Optional<Output<Boolean>> ignoreMinOccurs() {
        return Optional.ofNullable(this.ignoreMinOccurs);
    }

    /**
     * Schema configs that are layered based on their VersionSources that match the incoming message. Schema configs present in higher indices override those in lower indices with the same message type and trigger event if their VersionSources all match an incoming message.
     * 
     */
    @Import(name="schemas")
    private @Nullable Output<List<Hl7SchemaConfigArgs>> schemas;

    public Optional<Output<List<Hl7SchemaConfigArgs>>> schemas() {
        return Optional.ofNullable(this.schemas);
    }

    /**
     * Determines how messages that fail to parse are handled.
     * 
     */
    @Import(name="schematizedParsingType")
    private @Nullable Output<SchemaPackageSchematizedParsingType> schematizedParsingType;

    public Optional<Output<SchemaPackageSchematizedParsingType>> schematizedParsingType() {
        return Optional.ofNullable(this.schematizedParsingType);
    }

    /**
     * Schema type definitions that are layered based on their VersionSources that match the incoming message. Type definitions present in higher indices override those in lower indices with the same type name if their VersionSources all match an incoming message.
     * 
     */
    @Import(name="types")
    private @Nullable Output<List<Hl7TypesConfigArgs>> types;

    public Optional<Output<List<Hl7TypesConfigArgs>>> types() {
        return Optional.ofNullable(this.types);
    }

    /**
     * Determines how unexpected segments (segments not matched to the schema) are handled.
     * 
     */
    @Import(name="unexpectedSegmentHandling")
    private @Nullable Output<SchemaPackageUnexpectedSegmentHandling> unexpectedSegmentHandling;

    public Optional<Output<SchemaPackageUnexpectedSegmentHandling>> unexpectedSegmentHandling() {
        return Optional.ofNullable(this.unexpectedSegmentHandling);
    }

    private SchemaPackageArgs() {}

    private SchemaPackageArgs(SchemaPackageArgs $) {
        this.ignoreMinOccurs = $.ignoreMinOccurs;
        this.schemas = $.schemas;
        this.schematizedParsingType = $.schematizedParsingType;
        this.types = $.types;
        this.unexpectedSegmentHandling = $.unexpectedSegmentHandling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchemaPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchemaPackageArgs $;

        public Builder() {
            $ = new SchemaPackageArgs();
        }

        public Builder(SchemaPackageArgs defaults) {
            $ = new SchemaPackageArgs(Objects.requireNonNull(defaults));
        }

        public Builder ignoreMinOccurs(@Nullable Output<Boolean> ignoreMinOccurs) {
            $.ignoreMinOccurs = ignoreMinOccurs;
            return this;
        }

        public Builder ignoreMinOccurs(Boolean ignoreMinOccurs) {
            return ignoreMinOccurs(Output.of(ignoreMinOccurs));
        }

        public Builder schemas(@Nullable Output<List<Hl7SchemaConfigArgs>> schemas) {
            $.schemas = schemas;
            return this;
        }

        public Builder schemas(List<Hl7SchemaConfigArgs> schemas) {
            return schemas(Output.of(schemas));
        }

        public Builder schemas(Hl7SchemaConfigArgs... schemas) {
            return schemas(List.of(schemas));
        }

        public Builder schematizedParsingType(@Nullable Output<SchemaPackageSchematizedParsingType> schematizedParsingType) {
            $.schematizedParsingType = schematizedParsingType;
            return this;
        }

        public Builder schematizedParsingType(SchemaPackageSchematizedParsingType schematizedParsingType) {
            return schematizedParsingType(Output.of(schematizedParsingType));
        }

        public Builder types(@Nullable Output<List<Hl7TypesConfigArgs>> types) {
            $.types = types;
            return this;
        }

        public Builder types(List<Hl7TypesConfigArgs> types) {
            return types(Output.of(types));
        }

        public Builder types(Hl7TypesConfigArgs... types) {
            return types(List.of(types));
        }

        public Builder unexpectedSegmentHandling(@Nullable Output<SchemaPackageUnexpectedSegmentHandling> unexpectedSegmentHandling) {
            $.unexpectedSegmentHandling = unexpectedSegmentHandling;
            return this;
        }

        public Builder unexpectedSegmentHandling(SchemaPackageUnexpectedSegmentHandling unexpectedSegmentHandling) {
            return unexpectedSegmentHandling(Output.of(unexpectedSegmentHandling));
        }

        public SchemaPackageArgs build() {
            return $;
        }
    }

}
