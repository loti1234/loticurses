package net.mcreator.loticurses.client.model;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelfadeorc<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("loticurses", "modelfadeorc"), "main");
	public final ModelPart bone;
	public final ModelPart waist;
	public final ModelPart body;
	public final ModelPart body2;
	public final ModelPart cloth;
	public final ModelPart head;
	public final ModelPart jaw;
	public final ModelPart hair1;
	public final ModelPart hair2;
	public final ModelPart left_arm;
	public final ModelPart left_arm2;
	public final ModelPart axe;
	public final ModelPart right_arm;
	public final ModelPart right_arm2;
	public final ModelPart jewelry1;
	public final ModelPart jewelry2;
	public final ModelPart left_leg1;
	public final ModelPart left_leg2;
	public final ModelPart right_leg1;
	public final ModelPart right_leg2;

	public Modelfadeorc(ModelPart root) {
		this.bone = root.getChild("bone");
		this.waist = this.bone.getChild("waist");
		this.body = this.waist.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.cloth = this.body2.getChild("cloth");
		this.head = this.body.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.hair1 = this.head.getChild("hair1");
		this.hair2 = this.hair1.getChild("hair2");
		this.left_arm = this.body.getChild("left_arm");
		this.left_arm2 = this.left_arm.getChild("left_arm2");
		this.axe = this.left_arm2.getChild("axe");
		this.right_arm = this.waist.getChild("right_arm");
		this.right_arm2 = this.right_arm.getChild("right_arm2");
		this.jewelry1 = this.right_arm2.getChild("jewelry1");
		this.jewelry2 = this.right_arm2.getChild("jewelry2");
		this.left_leg1 = this.bone.getChild("left_leg1");
		this.left_leg2 = this.left_leg1.getChild("left_leg2");
		this.right_leg1 = this.bone.getChild("right_leg1");
		this.right_leg2 = this.right_leg1.getChild("right_leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition waist = bone.addOrReplaceChild("waist", CubeListBuilder.create(), PartPose.offset(0.0F, -16.0F, 0.0F));
		PartDefinition body = waist.addOrReplaceChild("body", CubeListBuilder.create().texOffs(56, 0).addBox(-9.0F, -10.0F, -5.0F, 18.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(56, 20).addBox(-11.0F, 20.0F, -4.0F, 14.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -20.0F, 0.0F));
		PartDefinition cloth = body2.addOrReplaceChild("cloth", CubeListBuilder.create().texOffs(0, 112).addBox(-7.0F, -2.0F, -4.0F, 14.0F, 9.0F, 8.0F, new CubeDeformation(0.2F)), PartPose.offset(-4.0F, 22.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(68, 59).addBox(-4.0F, -9.0F, -6.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(56, 0).addBox(3.0F, -6.0F, -5.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(56, 0)
						.addBox(-4.0F, -6.0F, -5.9F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(68, 77).addBox(-4.0F, -9.0F, -6.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(-0.2F)),
				PartPose.offset(0.0F, -9.5F, -2.5F));
		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(1, 83).addBox(-4.0F, -5.0F, -4.2F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 0.5F, -2.0F));
		PartDefinition hair1 = head.addOrReplaceChild("hair1", CubeListBuilder.create(), PartPose.offset(0.0F, -8.0F, 1.0F));
		PartDefinition cube_r1 = hair1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 34).addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition hair2 = hair1.addOrReplaceChild("hair2", CubeListBuilder.create(), PartPose.offset(0.0F, -2.8F, 2.8F));
		PartDefinition cube_r2 = hair2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(68, 34).addBox(0.0F, -7.0402F, -3.0F, 0.0F, 11.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 95).addBox(0.0F, -2.5F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(8.5F, -5.5F, 0.0F));
		PartDefinition left_arm2 = left_arm.addOrReplaceChild("left_arm2", CubeListBuilder.create().texOffs(80, 95).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 9.5F, 0.0F));
		PartDefinition axe = left_arm2.addOrReplaceChild("axe", CubeListBuilder.create().texOffs(0, 48).addBox(-1.0F, -1.0F, -25.0F, 2.0F, 2.0F, 32.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(0.0F, -7.0F, -30.0F, 0.0F, 20.0F, 28.0F, new CubeDeformation(0.0F)).texOffs(32, 82).addBox(-1.0F, -1.0F, -23.0F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 10.0F, 0.0F));
		PartDefinition right_arm = waist.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(60, 95).addBox(-5.0F, -2.5F, -2.5F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.5F, -11.5F, 0.0F));
		PartDefinition right_arm2 = right_arm.addOrReplaceChild("right_arm2", CubeListBuilder.create().texOffs(20, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 9.5F, 0.0F));
		PartDefinition jewelry1 = right_arm2.addOrReplaceChild("jewelry1", CubeListBuilder.create().texOffs(100, 26).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition jewelry2 = right_arm2.addOrReplaceChild("jewelry2", CubeListBuilder.create().texOffs(100, 20).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition left_leg1 = bone.addOrReplaceChild("left_leg1", CubeListBuilder.create().texOffs(96, 95).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -16.0F, 0.0F));
		PartDefinition left_leg2 = left_leg1.addOrReplaceChild("left_leg2", CubeListBuilder.create().texOffs(36, 96).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		PartDefinition right_leg1 = bone.addOrReplaceChild("right_leg1", CubeListBuilder.create().texOffs(96, 46).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -16.0F, 0.0F));
		PartDefinition right_leg2 = right_leg1.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(96, 34).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
